package com.example.blacksburgactivities

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val eventItems = ArrayList<EventItem>()

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        initArray(eventItems)
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val adapter = ListAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        //adapter.setEvents(adapter.events1)

        return view
    }

    private fun initArray(myDataset: MutableList<EventItem>) {
        myDataset.clear()

        myDataset.add(EventItem("Festival", "March 13", "Blacksburg", "Music Festival"))
        myDataset.add(EventItem("Karaoke", "March 20", "Blacksburg", "Dance the night away"))
        myDataset.add(EventItem("Fun times", "December 20", "Blacksburg", "Fun times fun vibes"))
        myDataset.add(EventItem("Name", "January 15", "Blacksburg", "Music"))

    }

inner class ListAdapter: RecyclerView.Adapter<ListAdapter.EventViewHolder>() {

    var events1 = eventItems

    fun setEvents(events: MutableList<EventItem>) {
        for (i in 0 until 20) {
            events.add(EventItem("name $i", "date $i", "location $i", "detail $i"))
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.EventViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return EventViewHolder(view)
    }

    override fun getItemCount(): Int {
        return events1.size
    }

    override fun onBindViewHolder(holder: ListAdapter.EventViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.eventName).text = events1[position].name

        // TODO bundleOf here

        holder.itemView.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_listFragment_to_detailFragment, bundleOf(
                "name" to eventItems[position].name,
                "date" to eventItems[position].date,
                "location" to eventItems[position].location,
                "detail" to eventItems[position].detail
            ))
        }
    }

    inner class EventViewHolder(val view: View): RecyclerView.ViewHolder(view){

    }
}
}