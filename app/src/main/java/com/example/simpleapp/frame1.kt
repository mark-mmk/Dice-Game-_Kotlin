package com.example.simpleapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class frame1 : Fragment() {
    lateinit var bt3: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt3 = view.findViewById(R.id.bt3)
        bt3.setOnClickListener {
            var name = arguments?.getString("name")
            var luckynum = arguments?.getString("lucky")
            var luck = luckynum.toString()
            val bundle = Bundle()
            bundle.putString("name", name)
            bundle.putString("lucky", luck)
            val f2 = frame2()
            f2.arguments = bundle
            parentFragmentManager.beginTransaction().replace(R.id.frame, f2).commit()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frame1, container, false)
    }
}