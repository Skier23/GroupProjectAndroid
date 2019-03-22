package com.example.blacksburgactivities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager


/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var name: String? = null
    private var date: String? = null
    private var location: String? = null
    private var detail: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val adapter = ListAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        adapter.setEvents(adapter.events1)

        return view
    }

inner class ListAdapter: RecyclerView.Adapter<ListAdapter.EventViewHolder>() {

    var events1 = mutableListOf<EventItem>()

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
            view?.findNavController()?.navigate(R.id.action_listFragment_to_detailFragment)
        }
    }

    inner class EventViewHolder(val view: View): RecyclerView.ViewHolder(view){

    }
}
}