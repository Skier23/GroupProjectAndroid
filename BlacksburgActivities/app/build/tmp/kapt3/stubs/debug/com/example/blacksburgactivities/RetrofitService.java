package com.example.blacksburgactivities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/blacksburgactivities/RetrofitService;", "", "getEvents", "Lio/reactivex/Observable;", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/blacksburgactivities/EventItem;", "api_key", "", "Companion", "app_debug"})
public abstract interface RetrofitService {
    public static final com.example.blacksburgactivities.RetrofitService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "calendars/11bampdqorga8karn6it0pcluk@group.calendar.google.com/events")
    public abstract io.reactivex.Observable<androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>>> getEvents(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String api_key);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/blacksburgactivities/RetrofitService$Companion;", "", "()V", "create", "Lcom/example/blacksburgactivities/RetrofitService;", "baseUrl", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.blacksburgactivities.RetrofitService create(@org.jetbrains.annotations.NotNull()
        java.lang.String baseUrl) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}