package com.example.blacksburgactivities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")
data class EventItem(@PrimaryKey @ColumnInfo(name = "name") val name: String,
                     @ColumnInfo(name = "date") val date: String,
                     @ColumnInfo(name = "location") val location: String,
                     @ColumnInfo(name = "detail") val detail: String)