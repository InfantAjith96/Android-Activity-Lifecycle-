package com.example.dummy

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

        Log.d("--->","This is onStart State")
    }
    override fun onResume() {
        super.onResume()

//        finishAndRemoveTask()
        Log.d("--->","This is onResume State")
    }

    override fun onPause() {
        super.onPause()

        Log.d("--->","This is onPause State")
    }

    override fun onStop() {
        super.onStop()

        Log.d("--->","This is onStop State")

        //The will go from recent activity
        finishAndRemoveTask()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("--->","This is onDestroy State")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("--->","This is onRestart State")
    }
}