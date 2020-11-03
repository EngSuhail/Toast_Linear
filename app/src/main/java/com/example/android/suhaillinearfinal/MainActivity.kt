package com.example.android.suhaillinearfinal

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var btClick:Button
    lateinit var etName:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btClick = findViewById<Button>(R.id.btt)
        etName = findViewById<EditText>(R.id.txt)
    }

    fun display(view: View) {
        var name: String = etName.getText().toString().trim()
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }


    }

