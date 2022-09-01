package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclovida", "Ingresa a onStart()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclovida", "Ingresa a onStop")
    }

    override fun onResume() {
        super.onResume()
       Log.i("ciclovida", "Ingresa a onResume()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclovida", "Ingresa a onDestroy()")
    }
}