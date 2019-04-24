package com.example.blacksburgactivities

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var recyclerView: RecyclerView
    private val eventItems = mutableListOf<EventItem>()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        initArray(eventItems)
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        val adapter = ListAdapter()
        recyclerView.adapter = adapter

        val model: EventViewModel? = ViewModelProviders.of(this).get(EventViewModel::class.java)


        model?.allEvents?.observe(this, Observer<List<EventItem>> { events ->
            events?.let {
                Log.d("WHY", "PLEASE TELL ME")
                adapter.setEvents(it)
            }

        })

        return view
    }

inner class ListAdapter: RecyclerView.Adapter<ListAdapter.EventViewHolder>() {

    private var events = emptyList<EventItem>()

    internal fun setEvents(events: List<EventItem>) {
        this.events = events
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.EventViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return EventViewHolder(view)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onBindViewHolder(holder: ListAdapter.EventViewHolder, position: Int) {
        val model : EventViewModel ? = activity?.run{ ViewModelProviders.of(this).get(EventViewModel::class.java) }

        holder.view.findViewById<TextView>(R.id.eventName).text = events[position].name

        // TODO bundleOf here

        holder.itemView.setOnClickListener {
            model?.chosenEvent = events[position]
            view?.findNavController()?.navigate(R.id.action_listFragment_to_detailFragment, bundleOf(
                "name" to eventItems[position].name,
                "date" to eventItems[position].date,
                "location" to eventItems[position].location,
                "detail" to eventItems[position].detail
            ))
        }
    }

    inner class EventViewHolder(val view: View): RecyclerView.ViewHolder(view), View.OnClickListener{
        override fun onClick(p0: View?) {
            Log.d("Yea", ":(")
        }

    }
}
}