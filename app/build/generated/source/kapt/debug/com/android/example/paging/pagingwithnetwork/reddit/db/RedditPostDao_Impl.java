package com.android.example.paging.pagingwithnetwork.reddit.db;

import android.arch.paging.DataSource;
import android.arch.paging.DataSource.Factory;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.arch.persistence.room.paging.LimitOffsetDataSource;
import android.database.Cursor;
import com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class RedditPostDao_Impl implements RedditPostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRedditPost;

  private final SharedSQLiteStatement __preparedStmtOfDeleteBySubreddit;

  public RedditPostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRedditPost = new EntityInsertionAdapter<RedditPost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `posts`(`indexInResponse`,`name`,`title`,`score`,`author`,`subreddit`,`num_comments`,`created`,`thumbnail`,`url`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RedditPost value) {
        stmt.bindLong(1, value.getIndexInResponse());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        stmt.bindLong(4, value.getScore());
        if (value.getAuthor() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthor());
        }
        if (value.getSubreddit() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSubreddit());
        }
        stmt.bindLong(7, value.getNum_comments());
        stmt.bindLong(8, value.getCreated());
        if (value.getThumbnail() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getThumbnail());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteBySubreddit = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM posts WHERE subreddit = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<RedditPost> posts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRedditPost.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteBySubreddit(String subreddit) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBySubreddit.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (subreddit == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, subreddit);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteBySubreddit.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, RedditPost> postsBySubreddit(String subreddit) {
    final String _sql = "SELECT * FROM posts WHERE subreddit = ? ORDER BY indexInResponse ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subreddit == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subreddit);
    }
    return new DataSource.Factory<Integer, RedditPost>() {
      @Override
      public LimitOffsetDataSource<RedditPost> create() {
        return new LimitOffsetDataSource<RedditPost>(__db, _statement, false , "posts") {
          @Override
          protected List<RedditPost> convertRows(Cursor cursor) {
            final int _cursorIndexOfIndexInResponse = cursor.getColumnIndexOrThrow("indexInResponse");
            final int _cursorIndexOfName = cursor.getColumnIndexOrThrow("name");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfScore = cursor.getColumnIndexOrThrow("score");
            final int _cursorIndexOfAuthor = cursor.getColumnIndexOrThrow("author");
            final int _cursorIndexOfSubreddit = cursor.getColumnIndexOrThrow("subreddit");
            final int _cursorIndexOfNumComments = cursor.getColumnIndexOrThrow("num_comments");
            final int _cursorIndexOfCreated = cursor.getColumnIndexOrThrow("created");
            final int _cursorIndexOfThumbnail = cursor.getColumnIndexOrThrow("thumbnail");
            final int _cursorIndexOfUrl = cursor.getColumnIndexOrThrow("url");
            final List<RedditPost> _res = new ArrayList<RedditPost>(cursor.getCount());
            while(cursor.moveToNext()) {
              final RedditPost _item;
              final String _tmpName;
              _tmpName = cursor.getString(_cursorIndexOfName);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final int _tmpScore;
              _tmpScore = cursor.getInt(_cursorIndexOfScore);
              final String _tmpAuthor;
              _tmpAuthor = cursor.getString(_cursorIndexOfAuthor);
              final String _tmpSubreddit;
              _tmpSubreddit = cursor.getString(_cursorIndexOfSubreddit);
              final int _tmpNum_comments;
              _tmpNum_comments = cursor.getInt(_cursorIndexOfNumComments);
              final long _tmpCreated;
              _tmpCreated = cursor.getLong(_cursorIndexOfCreated);
              final String _tmpThumbnail;
              _tmpThumbnail = cursor.getString(_cursorIndexOfThumbnail);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              _item = new RedditPost(_tmpName,_tmpTitle,_tmpScore,_tmpAuthor,_tmpSubreddit,_tmpNum_comments,_tmpCreated,_tmpThumbnail,_tmpUrl);
              final int _tmpIndexInResponse;
              _tmpIndexInResponse = cursor.getInt(_cursorIndexOfIndexInResponse);
              _item.setIndexInResponse(_tmpIndexInResponse);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public int getNextIndexInSubreddit(String subreddit) {
    final String _sql = "SELECT MAX(indexInResponse) + 1 FROM posts WHERE subreddit = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subreddit == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subreddit);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
