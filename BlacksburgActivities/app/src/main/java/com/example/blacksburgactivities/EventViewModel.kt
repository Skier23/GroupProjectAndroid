package com.example.blacksburgactivities

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class EventViewModel(application: Application): AndroidViewModel(application){

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob+ Dispatchers.Main


    private val scope = CoroutineScope(coroutineContext)


    var chosenEvent: EventItem ? = null


    private var disposable: Disposable? = null


    private val repository: EventItemRepository = EventItemRepository(EventRoomDatabase.getDatabase(application).eventDao())

    val allEvents: LiveData<List<EventItem>>

    init {
        allEvents = repository.allEvents
    }


    fun refreshEvents(page: Int){
        //TODO: add your API key from themoviedb.org
        disposable =
                RetrofitService.create("https://www.googleapis.com/calendar/v3").getNowPlaying("f4aa22812bd5c1f8dd1da955d85f2531122dbe88",page).subscribeOn(
                    Schedulers.io()).observeOn(
                    AndroidSchedulers.mainThread()).subscribe(
                    {result -> showResult(result)},
                    {error -> showError(error)})
    }



    private fun showError(error: Throwable?) {
        //TODO: handle error
        Log.d("HELLOWHY", "RIGHT HERE")
        Log.d("ERROR", error.toString())
    }

    private fun showResult(events: Events?) {

        events?.results?.forEach { event ->
            insert(event)
        }
    }

    fun insert(event: EventItem) = scope.launch(Dispatchers.IO) {
        repository.insert(event)
    }

    fun deleteEvent(id: String) = scope.launch(Dispatchers.IO){
        repository.deleteEvent(id)
    }

    fun deleteAll() = scope.launch (Dispatchers.IO){
        repository.deleteAll()
    }

    fun getEvent(id: String) = scope.launch(Dispatchers.IO) {
        repository.getEvent(id)
    }

    fun getAllEvents() = scope.launch(Dispatchers.IO) {
        repository.getAllEvents()
    }
}
