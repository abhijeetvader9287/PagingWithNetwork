package com.android.example.paging.pagingwithnetwork.reddit.repository.inDb;

import java.lang.System;

/**
 * * Repository implementation that uses a database PagedList + a boundary callback to return a
 * * listing that loads in pages.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\tH\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inDb/DbRedditPostRepository;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;", "db", "Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;", "redditApi", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "ioExecutor", "Ljava/util/concurrent/Executor;", "networkPageSize", "", "(Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;Ljava/util/concurrent/Executor;I)V", "getDb", "()Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;", "insertResultIntoDb", "", "subredditName", "", "body", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingResponse;", "postsOfSubreddit", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/Listing;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "subReddit", "pageSize", "refresh", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/NetworkState;", "Companion", "app_debug"})
public final class DbRedditPostRepository implements com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.android.example.paging.pagingwithnetwork.reddit.db.RedditDb db = null;
    private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi = null;
    private final java.util.concurrent.Executor ioExecutor = null;
    private final int networkPageSize = 0;
    private static final int DEFAULT_NETWORK_PAGE_SIZE = 10;
    public static final com.android.example.paging.pagingwithnetwork.reddit.repository.inDb.DbRedditPostRepository.Companion Companion = null;
    
    /**
     * * Inserts the response into the database while also assigning position indices to items.
     */
    private final void insertResultIntoDb(java.lang.String subredditName, com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse body) {
    }
    
    /**
     * * When refresh is called, we simply run a fresh network request and when it arrives, clear
     *     * the database table and insert all new items in a transaction.
     *     * <p>
     *     * Since the PagedList already uses a database bound data source, it will automatically be
     *     * updated after the database transaction is finished.
     */
    @android.support.annotation.MainThread()
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> refresh(java.lang.String subredditName) {
        return null;
    }
    
    /**
     * * Returns a Listing for the given subreddit.
     */
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.MainThread()
    @java.lang.Override()
    public com.android.example.paging.pagingwithnetwork.reddit.repository.Listing<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> postsOfSubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subReddit, int pageSize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.paging.pagingwithnetwork.reddit.db.RedditDb getDb() {
        return null;
    }
    
    public DbRedditPostRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.db.RedditDb db, @org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi redditApi, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor ioExecutor, int networkPageSize) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/inDb/DbRedditPostRepository$Companion;", "", "()V", "DEFAULT_NETWORK_PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}