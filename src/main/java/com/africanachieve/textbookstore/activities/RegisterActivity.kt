package com.africanachieve.textbookstore.activities

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.africanachieve.textbookstore.R

class RegisterActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText 
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etName = findViewById(R.id.et_name)
        etEmail = findViewById(R.id.et_email)
        btnRegister = findViewById(R.id.btn_register)

        btnRegister.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()

            if (name.isEmpty()) {
                etName.error = "Name required"
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "Enter valid email"
                return@setOnClickListener
            }

            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }
}
