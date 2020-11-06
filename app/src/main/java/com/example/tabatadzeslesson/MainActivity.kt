package com.example.tabatadzeslesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        }
    }

    fun init() {

        val button1 = findViewById<Button>(R.id.button1)
        val text1 = findViewById<TextView>(R.id.textView)
        button1.setOnClickListener {
        if ((-100 until 100).random()%5==0){
            text1.text = "Yes"
        }else {text1.text = "No"}

    }


    }



}