package com.example.starterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0;
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.Valuenumber)
        textView.text = counter.toString()

        button.setOnClickListener{
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++;
            textView.text = counter.toString()
        }
    }
}
