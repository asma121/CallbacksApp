package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext,"onStart Activity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2","on start")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume Activity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2","on resume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"onPause Activity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2","on pause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop Activity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2","on stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy Activity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2","on destroy")
    }
}