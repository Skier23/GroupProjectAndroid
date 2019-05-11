package com.example.blacksburgactivities;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/blacksburgactivities/EventItemDao;", "", "deleteAll", "", "deleteEvent", "id", "", "getAllEvents", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/blacksburgactivities/EventItem;", "getEvent", "insertEvent", "event", "app_debug"})
public abstract interface EventItemDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM item_table ORDER BY name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.blacksburgactivities.EventItem>> getAllEvents();
    
    @androidx.room.Query(value = "DELETE FROM item_table")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM item_table WHERE name = :id")
    public abstract void deleteEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertEvent(@org.jetbrains.annotations.NotNull()
    com.example.blacksburgactivities.EventItem event);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM item_table WHERE name = :id")
    public abstract com.example.blacksburgactivities.EventItem getEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}