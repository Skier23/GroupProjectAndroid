package com.example.blacksburgactivities

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

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

        return view
    }
}
