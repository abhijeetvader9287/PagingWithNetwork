package com.android.example.paging.pagingwithnetwork.reddit.repository;

import java.lang.System;

/**
 * * Common interface shared by the different repository implementations.
 * * Note: this only exists for sample purposes - typically an app would implement a repo once, either
 * * network+db, or network-only
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;", "", "postsOfSubreddit", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/Listing;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "subReddit", "", "pageSize", "", "Type", "app_debug"})
public abstract interface RedditPostRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.paging.pagingwithnetwork.reddit.repository.Listing<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> postsOfSubreddit(@org.jetbrains.annotations.NotNull()
    java.lang.String subReddit, int pageSize);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository$Type;", "", "(Ljava/lang/String;I)V", "IN_MEMORY_BY_ITEM", "IN_MEMORY_BY_PAGE", "DB", "app_debug"})
    public static enum Type {
        /*public static final*/ IN_MEMORY_BY_ITEM /* = new IN_MEMORY_BY_ITEM() */,
        /*public static final*/ IN_MEMORY_BY_PAGE /* = new IN_MEMORY_BY_PAGE() */,
        /*public static final*/ DB /* = new DB() */;
        
        Type() {
        }
    }
}