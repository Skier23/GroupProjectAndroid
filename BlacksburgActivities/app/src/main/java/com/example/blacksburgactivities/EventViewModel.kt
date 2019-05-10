package com.example.blacksburgactivities

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.util.*
import kotlin.concurrent.timerTask
import kotlin.coroutines.CoroutineContext

class EventViewModel(application: Application): AndroidViewModel(application){

    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob+ Dispatchers.Main


    private val scope = CoroutineScope(coroutineContext)


    var chosenEvent: EventItem ? = null


    private var disposable: Disposable? = null


    private val repository: EventItemRepository =
        EventItemRepository(EventRoomDatabase.getDatabase(application).eventDao())

    var allEvents: LiveData<List<EventItem>>

    val errorMessageLiveData = MutableLiveData<String>()
    private val refreshTimer: Timer = Timer()

    init {
        allEvents = repository.allEvents

        refreshTimer.schedule(timerTask {
            Log.d(TAG, "refreching events...")
            refreshEvents()
        }, 0, REFRESH_TIME)
    }


    fun refreshEvents(){
        //TODO: add your API key from googleapis.com
        disposable =
            RetrofitService.create("https://www.googleapis.com/calendar/v3/")
                .getEvents("AIzaSyCGaAdocy3TM_ChK_f7qo_Hm6Z24NzYDxI").subscribeOn(
                    Schedulers.io()
                ).observeOn(
                    AndroidSchedulers.mainThread()
                ).subscribe(
                    { result -> showResult(result) },
                    { error -> showError(error) })
    }



    private fun showError(error: Throwable?) {
        Log.e(TAG, error.toString())
        errorMessageLiveData.postValue(error?.message)
        errorMessageLiveData.postValue(null) // to prevent it from reshowing it a gain when going to stop state and coming back to start state
    }

    private fun showResult(events: LiveData<List<EventItem>>) {

        allEvents = events
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

    companion object {
        val TAG: String = EventViewModel::class.java.simpleName
        const val REFRESH_TIME: Long = 5 * 60 * 1000  // five minutes
    }
}