package com.example.simpleapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class frame3 : Fragment() {
    lateinit var again: Button
    lateinit var logout: Button
    lateinit var t: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        again = view.findViewById(R.id.again)
        logout = view.findViewById(R.id.logout)
        t = view.findViewById(R.id.tries)
        var name = arguments?.getString("name")
        var lucky = arguments?.getString("lucky")
        var tries = arguments?.getInt("tries")
        var Tries = tries.toString()
        t.text = "You Win After ${Tries.toString()} Tries"
        again.setOnClickListener {
            var i = Intent(activity, home::class.java)
            i.putExtra("name", name.toString())
            i.putExtra("lucky", lucky.toString())
            startActivity(i)
        }
        logout.setOnClickListener {
            var i = Intent(activity, MainActivity::class.java)
            startActivity(i)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frame3, container, false)
    }

}