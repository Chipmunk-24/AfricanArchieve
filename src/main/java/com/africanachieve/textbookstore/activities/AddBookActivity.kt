package com.africanachieve.textbookstore.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.africanachieve.textbookstore.R

class AddBookActivity : AppCompatActivity() {

    private lateinit var etTitle: EditText
    private lateinit var etCourse: EditText
    private lateinit var etPrice: EditText
    private lateinit var etCondition: EditText
    private lateinit var etDescription: EditText
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)

        etTitle = findViewById(R.id.et_book_title)
        etCourse = findViewById(R.id.et_course)
        etPrice = findViewById(R.id.et_price)
        etCondition = findViewById(R.id.et_condition)
        etDescription = findViewById(R.id.et_description)
        btnSave = findViewById(R.id.btn_save_book)

        btnSave.setOnClickListener {
            if (etTitle.text.toString().isEmpty()) {
                etTitle.error = "Book title required"
                return@setOnClickListener
            }
            if (etCourse.text.toString().isEmpty()) {
                etCourse.error = "Course required"
                return@setOnClickListener
            }
            if (etPrice.text.toString().isEmpty()) {
                etPrice.error = "Price required"
                return@setOnClickListener
            }
            Toast.makeText(this, "Book Added", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
