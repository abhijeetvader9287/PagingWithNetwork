package com.android.example.paging.pagingwithnetwork.reddit.repository.inMemory.byPage;

import java.lang.System;

/**
 * * A simple data source factory which also provides a way to observe the last created data source.
 * * This allows us to channel its network request status etc back to the UI. See the Listing creation
 * * in the Repository class.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inMemory/byPage/SubRedditDataSourceFactory;", "Landroid/arch/paging/DataSource$Factory;", "", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "redditApi", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "subredditName", "retryExecutor", "Ljava/util/concurrent/Executor;", "(Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;Ljava/lang/String;Ljava/util/concurrent/Executor;)V", "sourceLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inMemory/byPage/PageKeyedSubredditDataSource;", "getSourceLiveData", "()Landroid/arch/lifecycle/MutableLiveData;", "create", "Landroid/arch/paging/DataSource;", "app_debug"})
public final class SubRedditDataSourceFactory extends android.arch.paging.DataSource.Factory<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.inMemory.byPage.PageKeyedSubredditDataSource> sourceLiveData = null;
    private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi = null;
    private final java.lang.String subredditName = null;
    private final java.util.concurrent.Executor retryExecutor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.inMemory.byPage.PageKeyedSubredditDataSource> getSourceLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.arch.paging.DataSource<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> create() {
        return null;
    }
    
    public SubRedditDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi, @org.jetbrains.annotations.NotNull()
    java.lang.String subredditName, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor retryExecutor) {
        super();
    }
}