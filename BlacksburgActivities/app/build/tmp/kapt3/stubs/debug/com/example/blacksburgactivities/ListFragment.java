package com.example.blacksburgactivities;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/blacksburgactivities/ListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "eventItems", "", "Lcom/example/blacksburgactivities/EventItem;", "listAdapter", "Lcom/example/blacksburgactivities/ListFragment$ListAdapter;", "model", "Lcom/example/blacksburgactivities/EventViewModel;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "sample", "Landroid/widget/Button;", "viewManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "ListAdapter", "app_debug"})
public final class ListFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.blacksburgactivities.ListFragment.ListAdapter listAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager viewManager;
    private final java.util.List<com.example.blacksburgactivities.EventItem> eventItems = null;
    private com.example.blacksburgactivities.EventViewModel model;
    private android.widget.Button sample;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public ListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0002\b\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/blacksburgactivities/ListFragment$ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/blacksburgactivities/ListFragment$ListAdapter$EventViewHolder;", "Lcom/example/blacksburgactivities/ListFragment;", "eventItems", "", "Lcom/example/blacksburgactivities/EventItem;", "listView", "Landroid/view/View;", "(Lcom/example/blacksburgactivities/ListFragment;Ljava/util/List;Landroid/view/View;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEvents", "events", "setEvents$app_debug", "EventViewHolder", "app_debug"})
    public final class ListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.blacksburgactivities.ListFragment.ListAdapter.EventViewHolder> {
        private java.util.List<com.example.blacksburgactivities.EventItem> eventItems;
        private final android.view.View listView = null;
        
        public final void setEvents$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.blacksburgactivities.EventItem> events) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.blacksburgactivities.ListFragment.ListAdapter.EventViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.blacksburgactivities.ListFragment.ListAdapter.EventViewHolder holder, int position) {
        }
        
        public ListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.blacksburgactivities.EventItem> eventItems, @org.jetbrains.annotations.NotNull()
        android.view.View listView) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/blacksburgactivities/ListFragment$ListAdapter$EventViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Lcom/example/blacksburgactivities/ListFragment$ListAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "onClick", "", "p0", "app_debug"})
        public final class EventViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
            @org.jetbrains.annotations.NotNull()
            private final android.view.View view = null;
            
            @java.lang.Override()
            public void onClick(@org.jetbrains.annotations.Nullable()
            android.view.View p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View getView() {
                return null;
            }
            
            public EventViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View view) {
                super(null);
            }
        }
    }
}