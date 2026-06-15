package com.africanachieve.textbookstore.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.africanachieve.textbookstore.R

class InquiryActivity : AppCompatActivity() {

    private lateinit var etMessage: EditText
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inquiry)

        etMessage = findViewById(R.id.et_message)
        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener {
            if (etMessage.text.toString().isEmpty()) {
                etMessage.error = "Message required"
                return@setOnClickListener
            }
            Toast.makeText(this, "Inquiry Sent", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
