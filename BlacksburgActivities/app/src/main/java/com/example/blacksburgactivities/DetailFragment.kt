package com.example.blacksburgactivities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import java.util.*

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var name: String? = null
    private var date: String? = null
    private var location: String? = null
    private var detail: String? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = this.arguments?.getString("name")
            date = this.arguments?.getString("date")
            location = this.arguments?.getString("location")
            detail = this.arguments?.getString("detail")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_detail, container, false)
        
        (view.findViewById(R.id.name) as TextView).text = name
        (view.findViewById(R.id.date) as TextView).text = date
        (view.findViewById(R.id.location) as TextView).text = location
        (view.findViewById(R.id.detail) as TextView).text = detail

        button = view.findViewById(R.id.addToCalendar)
        button?.setOnClickListener {
            addCalendar()
        }

        return view
    }

    private fun addCalendar() {
        // sample intent for testing
        // TODO use real data
        val startMillis: Long = Calendar.getInstance().run {
            set(2019, 4, 11, 7, 45)
            timeInMillis
        }
        val endMillis: Long = Calendar.getInstance().run {
            set(2019, 4, 11, 8, 30)
            timeInMillis
        }
        val intent = Intent(Intent.ACTION_INSERT)
            .setData(CalendarContract.Events.CONTENT_URI)
            .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startMillis)
            .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endMillis)
            .putExtra(CalendarContract.Events.TITLE, "Demo")
            .putExtra(CalendarContract.Events.DESCRIPTION, "Demo this project")
            .putExtra(CalendarContract.Events.EVENT_LOCATION, "classroom")
            .putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY)
            .putExtra(Intent.EXTRA_EMAIL, "derekj11@vt.edu,ski23@vt.edu,clee98@vt.edu")
        startActivity(intent)
    }
}
