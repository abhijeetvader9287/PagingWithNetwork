package com.android.example.paging.pagingwithnetwork.reddit.repository.inMemory.byItem;

import java.lang.System;

/**
 * * Repository implementation that returns a Listing that loads data directly from the network
 * * and uses the Item's name as the key to discover prev/next pages.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inMemory/byItem/InMemoryByItemRepository;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;", "redditApi", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "networkExecutor", "Ljava/util/concurrent/Executor;", "(Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;Ljava/util/concurrent/Executor;)V", "postsOfSubreddit", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/Listing;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "subReddit", "", "pageSize", "", "app_debug"})
public final class InMemoryByItemRepository implements com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository {
    private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi = null;
    private final java.util.concurrent.Executor networkExecutor = null;
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public com.android.example.paging.pagingwithnetwork.reddit.repository.Listing<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> postsOfSubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subReddit, int pageSize) {
        return null;
    }
    
    public InMemoryByItemRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor networkExecutor) {
        super();
    }
}