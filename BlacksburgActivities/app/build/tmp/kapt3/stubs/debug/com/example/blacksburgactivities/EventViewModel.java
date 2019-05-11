package com.example.blacksburgactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001aJ\u0006\u0010\t\u001a\u00020&J\u000e\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001aJ\u000e\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\bJ\u0006\u0010,\u001a\u00020-J\u0012\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001c\u00101\u001a\u00020-2\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0002R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/example/blacksburgactivities/EventViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allEvents", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/blacksburgactivities/EventItem;", "getAllEvents", "()Landroidx/lifecycle/LiveData;", "setAllEvents", "(Landroidx/lifecycle/LiveData;)V", "chosenEvent", "getChosenEvent", "()Lcom/example/blacksburgactivities/EventItem;", "setChosenEvent", "(Lcom/example/blacksburgactivities/EventItem;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "disposable", "Lio/reactivex/disposables/Disposable;", "errorMessageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "refreshTimer", "Ljava/util/Timer;", "repository", "Lcom/example/blacksburgactivities/EventItemRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "deleteAll", "Lkotlinx/coroutines/Job;", "deleteEvent", "id", "getEvent", "insert", "event", "refreshEvents", "", "showError", "error", "", "showResult", "events", "Companion", "app_debug"})
public final class EventViewModel extends androidx.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.CompletableJob parentJob;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.blacksburgactivities.EventItem chosenEvent;
    private io.reactivex.disposables.Disposable disposable;
    private final com.example.blacksburgactivities.EventItemRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> allEvents;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessageLiveData = null;
    private final java.util.Timer refreshTimer = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final long REFRESH_TIME = 300000L;
    public static final com.example.blacksburgactivities.EventViewModel.Companion Companion = null;
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.blacksburgactivities.EventItem getChosenEvent() {
        return null;
    }
    
    public final void setChosenEvent(@org.jetbrains.annotations.Nullable()
    com.example.blacksburgactivities.EventItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> getAllEvents() {
        return null;
    }
    
    public final void setAllEvents(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessageLiveData() {
        return null;
    }
    
    public final void refreshEvents() {
    }
    
    private final void showError(java.lang.Throwable error) {
    }
    
    private final void showResult(androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> events) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.example.blacksburgactivities.EventItem event) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllEvents() {
        return null;
    }
    
    public EventViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/blacksburgactivities/EventViewModel$Companion;", "", "()V", "REFRESH_TIME", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}