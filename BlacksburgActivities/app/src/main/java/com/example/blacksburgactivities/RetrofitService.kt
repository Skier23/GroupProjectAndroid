package com.example.blacksburgactivities

import androidx.lifecycle.LiveData
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

// Change the api and the link
interface RetrofitService {
    @GET("calendars/11bampdqorga8karn6it0pcluk@group.calendar.google.com/events")
    fun getEvents(@Query("key") api_key: String): Observable<LiveData<List<EventItem>>>


    companion object {
        fun create(baseUrl: String): RetrofitService {

            val retrofit =
                Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(
                    GsonConverterFactory.create(GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create())
                )
                    .baseUrl(baseUrl)
                    .build()

            return retrofit.create(RetrofitService::class.java)
        }
    }
}