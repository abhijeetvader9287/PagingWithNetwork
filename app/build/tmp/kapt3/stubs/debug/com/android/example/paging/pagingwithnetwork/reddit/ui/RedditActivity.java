package com.android.example.paging.pagingwithnetwork.reddit.ui;

import java.lang.System;

/**
 * * A list activity that shows reddit posts in the given sub-reddit.
 * * <p>
 * * The intent arguments can be modified to make it use a different repository (see MainActivity).
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ui/RedditActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "model", "Lcom/android/example/paging/pagingwithnetwork/reddit/ui/SubRedditViewModel;", "getViewModel", "initAdapter", "", "initSearch", "initSwipeToRefresh", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "updatedSubredditFromInput", "Companion", "app_debug"})
public final class RedditActivity extends android.support.v7.app.AppCompatActivity {
    private com.android.example.paging.pagingwithnetwork.reddit.ui.SubRedditViewModel model;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SUBREDDIT = "subreddit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_SUBREDDIT = "androiddev";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_REPOSITORY_TYPE = "repository_type";
    public static final com.android.example.paging.pagingwithnetwork.reddit.ui.RedditActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.android.example.paging.pagingwithnetwork.reddit.ui.SubRedditViewModel getViewModel() {
        return null;
    }
    
    private final void initAdapter() {
    }
    
    private final void initSwipeToRefresh() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void initSearch() {
    }
    
    private final void updatedSubredditFromInput() {
    }
    
    public RedditActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/android/example/paging/pagingwithnetwork/reddit/ui/RedditActivity$Companion;", "", "()V", "DEFAULT_SUBREDDIT", "", "KEY_REPOSITORY_TYPE", "KEY_SUBREDDIT", "intentFor", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "type", "Lcom/android/example/paging/pagingwithnetwork/reddit/repository/RedditPostRepository$Type;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent intentFor(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.android.example.paging.pagingwithnetwork.reddit.repository.RedditPostRepository.Type type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}