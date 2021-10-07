package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.button)

        button.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext,"onStart Activity1",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","on start")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume Activity1",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","on resume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"onPause Activity1",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","on pause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop Activity1",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","on stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy Activity1",Toast.LENGTH_LONG).show()
        Log.d("MainActivity","on destroy")
    }
}