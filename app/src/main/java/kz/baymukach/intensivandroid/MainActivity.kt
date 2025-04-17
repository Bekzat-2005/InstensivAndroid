package kz.baymukach.intensivandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate вызван")
        Log.d("MainActivity", "FGHJKL")
        Log.d("LIFECYCLE", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        println("onStart вызван")
        Log.d("LIFECYCLE", "onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume вызван")
        Log.d("LIFECYCLE", "onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause вызван")
        Log.d("LIFECYCLE", "onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop вызван")
        Log.d("LIFECYCLE", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy вызван")
        Log.d("LIFECYCLE", "onDestroy")
    }



}