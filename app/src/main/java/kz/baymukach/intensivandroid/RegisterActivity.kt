package kz.baymukach.intensivandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val editName = findViewById<EditText>(R.id.editName)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener{
            val name = editName.text.toString();
            val email = editEmail.text.toString();
            val password = editPassword.text.toString();

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}