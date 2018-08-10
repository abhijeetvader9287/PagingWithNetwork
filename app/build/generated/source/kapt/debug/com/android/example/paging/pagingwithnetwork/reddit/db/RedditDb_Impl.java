package com.android.example.paging.pagingwithnetwork.reddit.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class RedditDb_Impl extends RedditDb {
  private volatile RedditPostDao _redditPostDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `posts` (`indexInResponse` INTEGER NOT NULL, `name` TEXT NOT NULL, `title` TEXT NOT NULL, `score` INTEGER NOT NULL, `author` TEXT NOT NULL, `subreddit` TEXT NOT NULL COLLATE NOCASE, `num_comments` INTEGER NOT NULL, `created` INTEGER NOT NULL, `thumbnail` TEXT, `url` TEXT, PRIMARY KEY(`name`))");
        _db.execSQL("CREATE  INDEX `index_posts_subreddit` ON `posts` (`subreddit`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"689f6d2571b0a0358e95f182b20f5ec5\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `posts`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPosts = new HashMap<String, TableInfo.Column>(10);
        _columnsPosts.put("indexInResponse", new TableInfo.Column("indexInResponse", "INTEGER", true, 0));
        _columnsPosts.put("name", new TableInfo.Column("name", "TEXT", true, 1));
        _columnsPosts.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsPosts.put("score", new TableInfo.Column("score", "INTEGER", true, 0));
        _columnsPosts.put("author", new TableInfo.Column("author", "TEXT", true, 0));
        _columnsPosts.put("subreddit", new TableInfo.Column("subreddit", "TEXT", true, 0));
        _columnsPosts.put("num_comments", new TableInfo.Column("num_comments", "INTEGER", true, 0));
        _columnsPosts.put("created", new TableInfo.Column("created", "INTEGER", true, 0));
        _columnsPosts.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", false, 0));
        _columnsPosts.put("url", new TableInfo.Column("url", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPosts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPosts = new HashSet<TableInfo.Index>(1);
        _indicesPosts.add(new TableInfo.Index("index_posts_subreddit", false, Arrays.asList("subreddit")));
        final TableInfo _infoPosts = new TableInfo("posts", _columnsPosts, _foreignKeysPosts, _indicesPosts);
        final TableInfo _existingPosts = TableInfo.read(_db, "posts");
        if (! _infoPosts.equals(_existingPosts)) {
          throw new IllegalStateException("Migration didn't properly handle posts(com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost).\n"
                  + " Expected:\n" + _infoPosts + "\n"
                  + " Found:\n" + _existingPosts);
        }
      }
    }, "689f6d2571b0a0358e95f182b20f5ec5", "2c709dec54ebec439e5d05ce3318c4d2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "posts");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `posts`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RedditPostDao posts() {
    if (_redditPostDao != null) {
      return _redditPostDao;
    } else {
      synchronized(this) {
        if(_redditPostDao == null) {
          _redditPostDao = new RedditPostDao_Impl(this);
        }
        return _redditPostDao;
      }
    }
  }
}
