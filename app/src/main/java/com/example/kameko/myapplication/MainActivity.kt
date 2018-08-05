package com.example.kameko.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TEXTDATA = "もしもし"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        messageTextView.setText("Hello, world!")

//        changebutton.setOnClickListener{
//            val intent = Intent(this, Main2Activity::class.java)
//            intent.putExtra(EXTRA_TEXTDATA, "sasasas")
//            startActivity(intent)
////            messageTextView.setText("Hello, world!")
//        }
    }

    fun ChangeTextView(view :View){
        val intent = Intent(this, Main2Activity::class.java)
        intent.putExtra(EXTRA_TEXTDATA, "sasasas")
        startActivity(intent)

    }

    fun ListClick(view : View){
        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)

    }


}
