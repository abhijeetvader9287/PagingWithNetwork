package com.android.example.paging.pagingwithnetwork.reddit.api;

import java.lang.System;

/**
 * * API communication setup
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u0000 \r2\u00020\u0001:\u0004\r\u000e\u000f\u0010J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "", "getTop", "Lretrofit2/Call;", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingResponse;", "subreddit", "", "limit", "", "getTopAfter", "after", "getTopBefore", "before", "Companion", "ListingData", "ListingResponse", "RedditChildrenResponse", "app_debug"})
public abstract interface RedditApi {
    public static final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/r/{subreddit}/hot.json")
    public abstract retrofit2.Call<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse> getTop(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "subreddit")
    java.lang.String subreddit, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/r/{subreddit}/hot.json")
    public abstract retrofit2.Call<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse> getTopAfter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "subreddit")
    java.lang.String subreddit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "after")
    java.lang.String after, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/r/{subreddit}/hot.json")
    public abstract retrofit2.Call<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingResponse> getTopBefore(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "subreddit")
    java.lang.String subreddit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "before")
    java.lang.String before, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingResponse;", "", "data", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingData;", "(Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingData;)V", "getData", "()Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingData;", "app_debug"})
    public static final class ListingResponse {
        @org.jetbrains.annotations.NotNull()
        private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingData data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingData getData() {
            return null;
        }
        
        public ListingResponse(@org.jetbrains.annotations.NotNull()
        com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.ListingData data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$ListingData;", "", "children", "", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$RedditChildrenResponse;", "after", "", "before", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAfter", "()Ljava/lang/String;", "getBefore", "getChildren", "()Ljava/util/List;", "app_debug"})
    public static final class ListingData {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.RedditChildrenResponse> children = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String after = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String before = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.RedditChildrenResponse> getChildren() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAfter() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBefore() {
            return null;
        }
        
        public ListingData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.RedditChildrenResponse> children, @org.jetbrains.annotations.Nullable()
        java.lang.String after, @org.jetbrains.annotations.Nullable()
        java.lang.String before) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$RedditChildrenResponse;", "", "data", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "(Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;)V", "getData", "()Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class RedditChildrenResponse {
        @org.jetbrains.annotations.NotNull()
        private final com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost getData() {
            return null;
        }
        
        public RedditChildrenResponse(@org.jetbrains.annotations.NotNull()
        com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi.RedditChildrenResponse copy(@org.jetbrains.annotations.NotNull()
        com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost data) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi$Companion;", "", "()V", "BASE_URL", "", "create", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "httpUrl", "Lokhttp3/HttpUrl;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String BASE_URL = "https://www.reddit.com/";
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi create() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi create(@org.jetbrains.annotations.NotNull()
        okhttp3.HttpUrl httpUrl) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}