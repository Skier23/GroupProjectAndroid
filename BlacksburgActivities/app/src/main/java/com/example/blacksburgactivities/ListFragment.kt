package com.example.blacksburgactivities

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract
import android.util.EventLog
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
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var recyclerView: RecyclerView
    private lateinit var listAdapter: ListAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private val eventItems = emptyList<EventItem>()
    private lateinit var model: EventViewModel


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        initArray(eventItems)
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        viewManager = LinearLayoutManager(context)
        listAdapter = ListAdapter(eventItems, view)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView).apply {
            layoutManager = viewManager
            adapter = listAdapter
        }

        model=  ViewModelProviders.of(this).get(EventViewModel::class.java)


        model.allEvents.observe(this, Observer<List<EventItem>> { events ->
            events?.let {
                Log.d("WHY", "PLEASE TELL ME")
                listAdapter.setEvents(it)
            }

        })

        return view
    }

    inner class ListAdapter(private var eventItems: List<EventItem>,
                      private val listView: View): RecyclerView.Adapter<ListAdapter.EventViewHolder>() {

        internal fun setEvents(events: List<EventItem>) {
            eventItems = events
            notifyDataSetChanged()
        }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.EventViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            return EventViewHolder(view)
        }

        override fun getItemCount(): Int {
            return eventItems.size
        }

        override fun onBindViewHolder(holder: ListAdapter.EventViewHolder, position: Int) {
            //val model : EventViewModel ? = activity?.run{ ViewModelProviders.of(this).get(EventViewModel::class.java) }

            holder.view.findViewById<TextView>(R.id.eventName).text = eventItems[position].name

            // TODO bundleOf here

            holder.itemView.setOnClickListener {
                model.chosenEvent = eventItems[position]
                listView?.findNavController()?.navigate(R.id.action_listFragment_to_detailFragment, bundleOf(
                    "name" to eventItems[position].name,
                    "date" to eventItems[position].date,
                    "location" to eventItems[position].location,
                    "detail" to eventItems[position].detail
                )
                )
            }
        }

        inner class EventViewHolder(val view: View): RecyclerView.ViewHolder(view), View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("Yea", ":(")
            }

        }
    }

}