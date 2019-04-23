package com.example.blacksburgactivities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EventItemDao {

    @Query ("SELECT * FROM item_table ORDER BY name ASC")
    fun getAllEvents(): LiveData<List<EventItem>>

    @Query ("DELETE FROM item_table")
    fun deleteAll()

    @Query ("DELETE FROM item_table WHERE name = :id")
    fun deleteEvent(id: String)

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertEvent(event: EventItem)

    @Query ("SELECT * FROM item_table WHERE name = :id")
    fun getEvent(id: String): EventItem
}