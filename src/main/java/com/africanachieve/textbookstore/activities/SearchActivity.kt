package com.africanachieve.textbookstore.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.africanachieve.textbookstore.R

class SearchActivity : AppCompatActivity() {

    private lateinit var etSearch: EditText
    private lateinit var btnSearchBook: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        etSearch = findViewById(R.id.et_search)
        btnSearchBook = findViewById(R.id.btn_search_book)

        btnSearchBook.setOnClickListener {
            if (etSearch.text.toString().isEmpty()) {
                etSearch.error = "Enter book title"
                return@setOnClickListener
            }
            Toast.makeText(this, "Searching Books...", Toast.LENGTH_SHORT).show()
        }
    }
}
