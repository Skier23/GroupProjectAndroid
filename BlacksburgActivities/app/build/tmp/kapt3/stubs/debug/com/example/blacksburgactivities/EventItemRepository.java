package com.example.blacksburgactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\t\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bH\u0007R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/blacksburgactivities/EventItemRepository;", "", "eventDao", "Lcom/example/blacksburgactivities/EventItemDao;", "(Lcom/example/blacksburgactivities/EventItemDao;)V", "allEvents", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/blacksburgactivities/EventItem;", "getAllEvents", "()Landroidx/lifecycle/LiveData;", "deleteAll", "", "deleteEvent", "id", "", "getEvent", "insert", "event", "app_debug"})
public final class EventItemRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> allEvents = null;
    private final com.example.blacksburgactivities.EventItemDao eventDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> getAllEvents() {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.blacksburgactivities.EventItem event) {
    }
    
    @androidx.annotation.WorkerThread()
    public final void deleteAll() {
    }
    
    @androidx.annotation.WorkerThread()
    public final void deleteEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @androidx.annotation.WorkerThread()
    public final void getEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @androidx.annotation.WorkerThread()
    public final void getAllEvents() {
    }
    
    public EventItemRepository(@org.jetbrains.annotations.NotNull()
    com.example.blacksburgactivities.EventItemDao eventDao) {
        super();
    }
}