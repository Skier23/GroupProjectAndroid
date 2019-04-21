package com.example.blacksburgactivities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EventItemDao {

    @Query ("SELECT * FROM item_table DESC")
    fun getAllEvents(): LiveData<List<EventItem>>

    @Query ("DELETE FROM item_table")
    fun DeleteAll()

    @Query ("DELETE FROM item_table WHERE ID = :id")
    fun deleteEvent(id: String)

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertEvent(event: EventItem)

    @Query ("SELECT * FROM item_table WHERE ID = :id")
    fun getEvent(id: String): EventItem
}