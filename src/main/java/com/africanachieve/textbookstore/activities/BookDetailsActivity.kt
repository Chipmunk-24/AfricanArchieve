package com.africanachieve.textbookstore.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.africanachieve.textbookstore.R

class BookDetailsActivity : AppCompatActivity() {

    private lateinit var btnInquiry: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        btnInquiry = findViewById(R.id.btn_inquiry)

        btnInquiry.setOnClickListener {
            startActivity(Intent(this, InquiryActivity::class.java))
        }
    }
}
