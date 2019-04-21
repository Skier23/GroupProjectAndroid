package com.example.blacksburgactivities

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [EventItem::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class EventRoomDatabase: RoomDatabase() {
    abstract fun eventDao(): EventItemDao

    companion object {
        @Volatile
        private var INSTANCE: EventRoomDatabase? = null

        fun getDatabase(
            context: Context
        ): EventRoomDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EventRoomDatabase::class.java,
                    "Movie_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}