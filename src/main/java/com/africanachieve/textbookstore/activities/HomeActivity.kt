package com.africanachieve.textbookstore.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.africanachieve.textbookstore.R
import com.africanachieve.textbookstore.adapters.BookAdapter
import com.africanachieve.textbookstore.models.Book

class HomeActivity : AppCompatActivity() {

    private lateinit var recyclerBooks: RecyclerView
    private lateinit var btnAddBook: Button
    private lateinit var btnSearch: Button

    private val bookList = mutableListOf<Book>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerBooks = findViewById(R.id.recycler_books)
        btnAddBook = findViewById(R.id.btn_add_book)
        btnSearch = findViewById(R.id.btn_search)

        recyclerBooks.layoutManager = LinearLayoutManager(this)

        bookList.add(
            Book(
                "Mobile App Development",
                "Information Technology",
                "R350",
                "Good",
                "Android development textbook"
            )
        )

        val adapter = BookAdapter(bookList)
        recyclerBooks.adapter = adapter

        btnAddBook.setOnClickListener {
            startActivity(Intent(this, AddBookActivity::class.java))
        }

        btnSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }
    }
}
