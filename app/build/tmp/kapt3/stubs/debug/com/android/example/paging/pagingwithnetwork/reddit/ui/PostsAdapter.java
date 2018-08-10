package com.android.example.paging.pagingwithnetwork.reddit.ui;

import java.lang.System;

/**
 * * A simple adapter implementation that shows Reddit posts.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J&\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ui/PostsAdapter;", "Landroid/arch/paging/PagedListAdapter;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "glide", "error/NonExistentClass", "retryCallback", "Lkotlin/Function0;", "", "(Lerror/NonExistentClass;Lkotlin/jvm/functions/Function0;)V", "Lerror/NonExistentClass;", "networkState", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/NetworkState;", "getItemCount", "", "getItemViewType", "position", "hasExtraRow", "", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNetworkState", "newNetworkState", "Companion", "app_debug"})
public final class PostsAdapter extends android.arch.paging.PagedListAdapter<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost, android.support.v7.widget.RecyclerView.ViewHolder> {
    private com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState networkState;
    private final error.NonExistentClass glide = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retryCallback = null;
    private static final java.lang.Object PAYLOAD_SCORE = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.support.v7.util.DiffUtil.ItemCallback<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> POST_COMPARATOR = null;
    public static final com.android.example.paging.pagingwithnetwork.reddit.ui.PostsAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final boolean hasExtraRow() {
        return false;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNetworkState(@org.jetbrains.annotations.Nullable()
    com.android.example.paging.pagingwithnetwork.reddit.repository.NetworkState newNetworkState) {
    }
    
    public PostsAdapter(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass glide, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryCallback) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ui/PostsAdapter$Companion;", "", "()V", "PAYLOAD_SCORE", "POST_COMPARATOR", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/android/example/paging/pagingwithnetwork/reddit/vo/RedditPost;", "getPOST_COMPARATOR", "()Landroid/support/v7/util/DiffUtil$ItemCallback;", "sameExceptScore", "", "oldItem", "newItem", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.support.v7.util.DiffUtil.ItemCallback<com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost> getPOST_COMPARATOR() {
            return null;
        }
        
        private final boolean sameExceptScore(com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost oldItem, com.android.example.paging.pagingwithnetwork.reddit.vo.RedditPost newItem) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}