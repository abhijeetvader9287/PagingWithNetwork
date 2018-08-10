package com.android.example.paging.pagingwithnetwork.reddit.db;

import java.lang.System;

/**
 * * Database schema used by the DbRedditPostRepository
 */
@android.arch.persistence.room.Database(entities = {com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "posts", "Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditPostDao;", "Companion", "app_debug"})
public abstract class RedditDb extends android.arch.persistence.room.RoomDatabase {
    public static final com.android.example.paging.pagingwithnetwork.reddit.db.RedditDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.paging.pagingwithnetwork.reddit.db.RedditPostDao posts();
    
    public RedditDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb$Companion;", "", "()V", "create", "Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;", "context", "Landroid/content/Context;", "useInMemory", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.db.RedditDb create(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean useInMemory) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}