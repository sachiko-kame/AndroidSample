package com.example.kameko.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SimpleAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val items = List<Map<String, String>>(20, { i -> mapOf("title" to "title-$i", "detail" to "detail-$i")})
//        val items = Array(20, { i -> "Title-数は$i" })

        val adapter = SimpleAdapter(
                this,
                items,
                android.R.layout.simple_list_item_2,
                arrayOf("title", "detail"),
                intArrayOf(android.R.id.text1, android.R.id.text2)
        )
        myListView1.adapter = adapter


        myListView1.setOnItemClickListener { adapterView, view, position, id ->
//            val textView = view.findViewById<TextView>(android.R.id.text1)
            Toast.makeText(this, "トースト", Toast.LENGTH_SHORT).show()



        }

    }
}
