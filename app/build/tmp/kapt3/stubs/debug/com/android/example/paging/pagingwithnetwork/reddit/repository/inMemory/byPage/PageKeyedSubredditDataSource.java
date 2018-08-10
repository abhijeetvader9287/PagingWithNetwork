package com.android.example.paging.pagingwithnetwork.reddit.repository.inMemory.byPage;

import java.lang.System;

/**
 * * A data source that uses the before/after keys returned in page requests.
 * * <p>
 * * See ItemKeyedSubredditDataSource
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ*\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J*\u0010\u001a\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J*\u0010\u001b\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inMemory/byPage/PageKeyedSubredditDataSource;", "Landroid/arch/paging/PageKeyedDataSource;", "", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "redditApi", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "subredditName", "retryExecutor", "Ljava/util/concurrent/Executor;", "(Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;Ljava/lang/String;Ljava/util/concurrent/Executor;)V", "initialLoad", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/NetworkState;", "getInitialLoad", "()Landroid/arch/lifecycle/MutableLiveData;", "networkState", "getNetworkState", "retry", "Lkotlin/Function0;", "", "loadAfter", "", "params", "Landroid/arch/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroid/arch/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroid/arch/paging/PageKeyedDataSource$LoadInitialParams;", "Landroid/arch/paging/PageKeyedDataSource$LoadInitialCallback;", "retryAllFailed", "app_debug"})
public final class PageKeyedSubredditDataSource extends android.arch.paging.PageKeyedDataSource<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> {
    private kotlin.jvm.functions.Function0<? extends java.lang.Object> retry;
    
    /**
     * * There is no sync on the state because paging will always call loadInitial first then wait
     *     * for it to return some success value before calling loadAfter.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> initialLoad = null;
    private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi = null;
    private final java.lang.String subredditName = null;
    private final java.util.concurrent.Executor retryExecutor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> getInitialLoad() {
        return null;
    }
    
    public final void retryAllFailed() {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    android.arch.paging.PageKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    android.arch.paging.PageKeyedDataSource.LoadCallback<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    android.arch.paging.PageKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    android.arch.paging.PageKeyedDataSource.LoadCallback<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> callback) {
    }
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    android.arch.paging.PageKeyedDataSource.LoadInitialParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    android.arch.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> callback) {
    }
    
    public PageKeyedSubredditDataSource(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi, @org.jetbrains.annotations.NotNull()
    java.lang.String subredditName, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor retryExecutor) {
        super();
    }
}