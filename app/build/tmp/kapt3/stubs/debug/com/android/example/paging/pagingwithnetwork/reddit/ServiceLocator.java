package com.android.example.paging.pagingwithnetwork.reddit;

import java.lang.System;

/**
 * * Super simplified service locator implementation to allow us to replace default implementations
 * * for testing.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ServiceLocator;", "", "getDiskIOExecutor", "Ljava/util/concurrent/Executor;", "getNetworkExecutor", "getRedditApi", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "getRepository", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;", "type", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository$Type;", "Companion", "app_debug"})
public abstract interface ServiceLocator {
    public static final com.android.example.paging.pagingwithnetwork.reddit.ServiceLocator.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository getRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository.Type type);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.concurrent.Executor getNetworkExecutor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.concurrent.Executor getDiskIOExecutor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi getRedditApi();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ServiceLocator$Companion;", "", "()V", "LOCK", "instance", "Lcom/android/example/paging/pagingwithnetwork/reddit/ServiceLocator;", "context", "Landroid/content/Context;", "swap", "", "locator", "app_debug"})
    public static final class Companion {
        private static final java.lang.Object LOCK = null;
        private static com.android.example.paging.pagingwithnetwork.reddit.ServiceLocator instance;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.paging.pagingwithnetwork.reddit.ServiceLocator instance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * * Allows tests to replace the default implementations.
         */
        @android.support.annotation.VisibleForTesting()
        public final void swap(@org.jetbrains.annotations.NotNull()
        com.android.example.paging.pagingwithnetwork.reddit.ServiceLocator locator) {
        }
        
        private Companion() {
            super();
        }
    }
}