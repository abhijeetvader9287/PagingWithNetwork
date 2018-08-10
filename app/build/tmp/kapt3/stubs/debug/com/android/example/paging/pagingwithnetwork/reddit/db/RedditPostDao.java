package com.android.example.paging.pagingwithnetwork.reddit.db;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\'J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditPostDao;", "", "deleteBySubreddit", "", "subreddit", "", "getNextIndexInSubreddit", "", "insert", "posts", "", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "postsBySubreddit", "Landroid/arch/paging/DataSource$Factory;", "app_debug"})
public abstract interface RedditPostDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> posts);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM posts WHERE subreddit = :subreddit ORDER BY indexInResponse ASC")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> postsBySubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subreddit);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM posts WHERE subreddit = :subreddit")
    public abstract void deleteBySubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subreddit);
    
    @android.arch.persistence.room.Query(value = "SELECT MAX(indexInResponse) + 1 FROM posts WHERE subreddit = :subreddit")
    public abstract int getNextIndexInSubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subreddit);
}