package com.africanachieve.textbookstore.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.africanachieve.textbookstore.R
import com.africanachieve.textbookstore.activities.BookDetailsActivity
import com.africanachieve.textbookstore.models.Book

class BookAdapter(
    private val bookList: List<Book>
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tv_book_title)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_book_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val currentBook = bookList[position]
        holder.tvTitle.text = currentBook.title
        holder.tvPrice.text = currentBook.price

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, BookDetailsActivity::class.java)
            // You can pass book details if needed
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = bookList.size
}
