package com.example.simpleapp

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi


class frame2 : Fragment() {
    lateinit var result: TextView
    lateinit var imagebutton: ImageView
    var tries: Int = 1

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        result = view.findViewById(R.id.result)
        imagebutton = view.findViewById(R.id.imagebutton)
        var name = arguments?.getString("name")
        var lucky = arguments?.getString("lucky")
        var number = lucky?.toInt()
        var random = (1..6).random()
        result.text = random.toString()
        if (number == random) {
            if (number == random) {
                result.text = "You Win ${random.toString()}"
                imagebutton.setOnClickListener {
                    val bundle = Bundle()
                    bundle.putString("name", name)
                    bundle.putString("lucky", lucky)
                    bundle.putInt("tries", tries)
                    val f3 = frame3()
                    f3.arguments = bundle
                    parentFragmentManager.beginTransaction().replace(R.id.frame, f3).commit()
                }
            }
        } else {
            imagebutton.setOnClickListener {
                tries++
                var random = (1..6).random()
                result.text = random.toString()
                if (number == random) {
                    result.text = "You Win ${random.toString()}"
                    imagebutton.setOnClickListener {
                        val bundle = Bundle()
                        bundle.putString("name", name)
                        bundle.putString("lucky", lucky)
                        bundle.putInt("tries", tries)
                        val f3 = frame3()
                        f3.arguments = bundle
                        parentFragmentManager.beginTransaction().replace(R.id.frame, f3).commit()
                    }
                }
            }

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frame2, container, false)
    }
}