package com.example.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = listOf(
            "Tomatoes",
            "Bananas",
            "Watermelons",
            "Apples",
            "Grapes",
            "Oranges",
            "Mangoes",
            "Plantains",
            "Tangerines",
            "Pineapples",
            "Melons",
            "Peaches",
            "Pears",
            "Lemons",
            "Papayas",
            "Plums",
            "Grapefruits",
            "Dates",
            "Strawberries",
            "Avocados",
            "Persimmons"
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = RecyclerViewAdapter(fruits) { position, text ->
            Toast.makeText(this, "[$position] $text", Toast.LENGTH_SHORT).show()
        }
    }
}