package com.android.example.paging.pagingwithnetwork.reddit.repository;

import java.lang.System;

/**
 * * Data class that is necessary for a UI to show a listing and interact w/ the rest of the system
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BQ\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003Je\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/repository/Listing;", "T", "", "pagedList", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "networkState", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/NetworkState;", "refreshState", "refresh", "Lkotlin/Function0;", "", "retry", "(Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/LiveData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getNetworkState", "()Landroid/arch/lifecycle/LiveData;", "getPagedList", "getRefresh", "()Lkotlin/jvm/functions/Function0;", "getRefreshState", "getRetry", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Listing<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<T>> pagedList = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> refreshState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> refresh = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<T>> getPagedList() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRefresh() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRetry() {
        return null;
    }
    
    public Listing(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<android.arch.paging.PagedList<T>> pagedList, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> networkState, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> refreshState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<T>> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
        return null;
    }
    
    /**
     * * Data class that is necessary for a UI to show a listing and interact w/ the rest of the system
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.paging.pagingwithnetwork.reddit.repository.Listing<T> copy(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<android.arch.paging.PagedList<T>> pagedList, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> networkState, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState> refreshState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
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