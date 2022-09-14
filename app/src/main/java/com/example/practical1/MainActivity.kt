package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    // Function that changes text and toggles visibility
    fun buttonWasPressed(view: View) {
        val textV = findViewById<TextView>(R.id.my_lovely_text)
        textV.text = "It Worked!"

        // Challenge 1 & 2
        if (textV.isVisible){
            textV.visibility = View.INVISIBLE
        }
        else{
            textV.visibility = View.VISIBLE
        }
    }

}






