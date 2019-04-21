package com.example.blacksburgactivities

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class EventItemRepository(private val eventDao: EventItemDao) {

    val allEvents: LiveData<List<EventItem>> = eventDao.getAllEvents()

    @WorkerThread
    fun insert(event: EventItem) {
        eventDao.insertEvent(event)
    }

    @WorkerThread
    fun deleteAll() {
        eventDao.DeleteAll()
    }

    @WorkerThread
    fun deleteEvent(id: String) {
        eventDao.deleteEvent(id)
    }

    @WorkerThread
    fun getEvent(id: String) {
        eventDao.getEvent(id)
    }

    @WorkerThread
    fun getAllEvents() {
        eventDao.getAllEvents()
    }
}