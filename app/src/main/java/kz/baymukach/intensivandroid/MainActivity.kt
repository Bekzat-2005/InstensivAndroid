package kz.baymukach.intensivandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        println("onCreate вызван")
//        Log.d("MainActivity", "FGHJKL")
//        Log.d("LIFECYCLE", "OnCreate")
//
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);

        val users = listOf(
            User("Bekzat", 19),
            User("Ali", 19)
        )

        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = UserAdapter(users){ clickedUser ->
            Toast.makeText(this, clickedUser.name, Toast.LENGTH_SHORT).show();
        }
    }



//    lifeSicle
//    override fun onStart() {
//        super.onStart()
//        println("onStart вызван")
//        Log.d("LIFECYCLE", "onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        println("onResume вызван")
//        Log.d("LIFECYCLE", "onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        println("onPause вызван")
//        Log.d("LIFECYCLE", "onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        println("onStop вызван")
//        Log.d("LIFECYCLE", "onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        println("onDestroy вызван")
//        Log.d("LIFECYCLE", "onDestroy")
//    }



}