package com.android.example.paging.pagingwithnetwork.reddit;

import java.lang.System;

/**
 * * default implementation of ServiceLocator that uses production endpoints.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u001e\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006%"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/DefaultServiceLocator;", "Lcom/android/example/paging/pagingwithnetwork/reddit/ServiceLocator;", "app", "Landroid/app/Application;", "useInMemoryDb", "", "(Landroid/app/Application;Z)V", "DISK_IO", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "DISK_IO$annotations", "()V", "NETWORK_IO", "NETWORK_IO$annotations", "api", "Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "getApi", "()Lcom/android/example/paging/pagingwithnetwork/reddit/api/RedditApi;", "api$delegate", "Lkotlin/Lazy;", "getApp", "()Landroid/app/Application;", "db", "Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;", "getDb", "()Lcom/android/example/paging/pagingwithnetwork/reddit/db/RedditDb;", "db$delegate", "getUseInMemoryDb", "()Z", "getDiskIOExecutor", "Ljava/util/concurrent/Executor;", "getNetworkExecutor", "getRedditApi", "getRepository", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository;", "type", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository$Type;", "app_debug"})
public class DefaultServiceLocator implements com.android.example.paging.pagingwithnetwork.reddit.ServiceLocator {
    private final java.util.concurrent.ExecutorService DISK_IO = null;
    private final java.util.concurrent.ExecutorService NETWORK_IO = null;
    private final kotlin.Lazy db$delegate = null;
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    private final boolean useInMemoryDb = false;
    
    @kotlin.Suppress(names = {"PrivatePropertyName"})
    private static void DISK_IO$annotations() {
    }
    
    @kotlin.Suppress(names = {"PrivatePropertyName"})
    private static void NETWORK_IO$annotations() {
    }
    
    private final com.android.example.paging.pagingwithnetwork.reddit.db.RedditDb getDb() {
        return null;
    }
    
    private final com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository getRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.concurrent.Executor getNetworkExecutor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.concurrent.Executor getDiskIOExecutor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.android.example.paging.pagingwithnetwork.reddit.api.RedditApi getRedditApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final boolean getUseInMemoryDb() {
        return false;
    }
    
    public DefaultServiceLocator(@org.jetbrains.annotations.NotNull()
    android.app.Application app, boolean useInMemoryDb) {
        super();
    }
}