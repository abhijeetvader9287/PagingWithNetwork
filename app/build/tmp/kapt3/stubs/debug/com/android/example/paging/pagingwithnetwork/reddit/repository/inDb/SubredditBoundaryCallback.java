package com.android.example.paging.pagingwithnetwork.reddit.repository.inDb;

import java.lang.System;

/**
 * * This boundary callback gets notified when user reaches to the edges of the list such that the
 * * database cannot provide any more data.
 * * <p>
 * * The boundary callback might be called multiple times for the same direction so it does its own
 * * rate limiting using the PagingRequestHelper class.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001e\u0010\u001d\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0002H\u0017J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\nH\u0017R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inDb/SubredditBoundaryCallback;", "Landroid/arch/paging/PagedList$BoundaryCallback;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "subredditName", "", "webservice", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "handleResponse", "Lkotlin/Function2;", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingResponse;", "", "ioExecutor", "Ljava/util/concurrent/Executor;", "networkPageSize", "", "(Ljava/lang/String;Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;I)V", "helper", "Landroid/arch/paging/PagingRequestHelper;", "getHelper", "()Landroid/arch/paging/PagingRequestHelper;", "networkState", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/NetworkState;", "getNetworkState", "()Landroid/arch/lifecycle/LiveData;", "createWebserviceCallback", "Lretrofit2/Callback;", "it", "Landroid/arch/paging/PagingRequestHelper$Request$Callback;", "insertItemsIntoDb", "response", "Lretrofit2/Response;", "onItemAtEndLoaded", "itemAtEnd", "onItemAtFrontLoaded", "itemAtFront", "onZeroItemsLoaded", "app_debug"})
public final class SubredditBoundaryCallback extends android.arch.paging.PagedList.BoundaryCallback<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.paging.PagingRequestHelper helper = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> networkState = null;
    private final java.lang.String subredditName = null;
    private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi webservice = null;
    private final kotlin.jvm.functions.Function2<java.lang.String, com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse, kotlin.Unit> handleResponse = null;
    private final java.util.concurrent.Executor ioExecutor = null;
    private final int networkPageSize = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.paging.PagingRequestHelper getHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> getNetworkState() {
        return null;
    }
    
    /**
     * * Database returned 0 items. We should query the backend for more items.
     */
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    /**
     * * User reached to the end of the list.
     */
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost itemAtEnd) {
    }
    
    /**
     * * every time it gets new items, boundary callback simply inserts them into the database and
     *     * paging library takes care of refreshing the list if necessary.
     */
    private final void insertItemsIntoDb(retrofit2.Response<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse> response, android.arch.paging.PagingRequestHelper.Request.Callback it) {
    }
    
    @java.lang.Override()
    public void onItemAtFrontLoaded(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost itemAtFront) {
    }
    
    private final retrofit2.Callback<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse> createWebserviceCallback(android.arch.paging.PagingRequestHelper.Request.Callback it) {
        return null;
    }
    
    public SubredditBoundaryCallback(@org.jetbrains.annotations.NotNull()
    java.lang.String subredditName, @org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi webservice, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse, kotlin.Unit> handleResponse, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor ioExecutor, int networkPageSize) {
        super();
    }
}