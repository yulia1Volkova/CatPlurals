package com.practicum.emptyproject

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var str: String = ""
        for (i in 0..33) {
            val systemPlural = this.resources.getQuantityString(R.plurals.plurals_1, i, i)
            val catPlural = this.resources.getQuantityString(R.plurals.plurals_2, i, i)
            str += "$systemPlural : $catPlural\n"
            Log.i("Plurals", "$systemPlural : $catPlural")
        }
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = str
    }
}