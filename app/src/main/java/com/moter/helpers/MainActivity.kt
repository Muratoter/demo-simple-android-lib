package com.moter.helpers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.moter.sydneysuburbs.Sydney

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", Sydney.suburbs.toString())
        Log.d("MainActivity", Melbourne.suburbs.toString())

    }
}