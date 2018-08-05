package com.example.kameko.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val items = Array(20, { i -> "Title-数は$i" })

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        //上も可能
//        val listView = findViewById(R.id.myListView1) as ListView
//        listView.adapter = adapter

        myListView1.adapter = adapter

        myListView1.setOnItemClickListener { adapterView, view, position, id ->
            val textView = view.findViewById<TextView>(android.R.id.text1)
            Toast.makeText(this, "Clicked: ${textView.text}", Toast.LENGTH_SHORT).show()
        }

    }
}
