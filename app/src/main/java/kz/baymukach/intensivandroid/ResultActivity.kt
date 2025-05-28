package kz.baymukach.intensivandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val textResult = findViewById<TextView>(R.id.textResult)

        val name = intent.getStringExtra("name");
        textResult.text = name;
    }
}