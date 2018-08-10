package com.android.example.paging.pagingwithnetwork.reddit.ui;

import java.lang.System;

/**
 * * A RecyclerView ViewHolder that displays a single reddit post.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \b*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nRJ\u0010\u0011\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \b*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00120\u0012 \b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \b*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00120\u0012\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ui/SubRedditViewModel;", "Landroid/arch/lifecycle/ViewModel;", "repository", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;", "(Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;)V", "networkState", "Landroid/arch/lifecycle/LiveData;", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/NetworkState;", "kotlin.jvm.PlatformType", "getNetworkState", "()Landroid/arch/lifecycle/LiveData;", "posts", "Landroid/arch/paging/PagedList;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "getPosts", "refreshState", "getRefreshState", "repoResult", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/Listing;", "subredditName", "Landroid/arch/lifecycle/MutableLiveData;", "", "currentSubreddit", "refresh", "", "retry", "showSubreddit", "", "subreddit", "app_debug"})
public final class SubRedditViewModel extends android.arch.lifecycle.ViewModel {
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> subredditName = null;
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.Listing<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost>> repoResult = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost>> posts = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> refreshState = null;
    private final com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost>> getPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> getRefreshState() {
        return null;
    }
    
    public final void refresh() {
    }
    
    public final boolean showSubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subreddit) {
        return false;
    }
    
    public final void retry() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String currentSubreddit() {
        return null;
    }
    
    public SubRedditViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository repository) {
        super();
    }
}