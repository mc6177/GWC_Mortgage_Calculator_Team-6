package com.example.mortgagecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity5 : ComponentActivity() {
    // Declare UI components for Text Views
    private lateinit var FirstNameTextView: TextView
    private lateinit var LastNameTextView: TextView
    private lateinit var EmailTextView: TextView
    private lateinit var MessageTextView: TextView
    private lateinit var Newsletter1TextView: TextView
    private lateinit var Newsletter2TextView: TextView

    // Declare UI components for Edit Text
    private lateinit var FirstNameEditText: EditText
    private lateinit var LastNameEditText: EditText
    private lateinit var EmailEditText: EditText
    private lateinit var MessageEditText: EditText
    private lateinit var NewsletterEmailEditText: EditText

    // Declare UI components for Buttons
    private lateinit var SubmitInquiryButton: Button
    private lateinit var SubmitEmailButton: Button
    private lateinit var LogOutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        // Initialize TextView
        // Make sure it matches ID in xml file
        FirstNameTextView = findViewById(R.id.textView)
        LastNameTextView = findViewById(R.id.textView2)
        EmailTextView = findViewById(R.id.textView3)
        MessageTextView = findViewById(R.id.textView4)
        Newsletter1TextView = findViewById(R.id.textView5)
        Newsletter2TextView = findViewById(R.id.textView6)

        // Initialize EditText
        // Make sure it matches ID in xml file
        FirstNameEditText = findViewById(R.id.editTextText2)
        LastNameEditText = findViewById(R.id.editTextText3)
        EmailEditText = findViewById(R.id.editTextText4)
        MessageEditText = findViewById(R.id.editTextText5)
        NewsletterEmailEditText = findViewById(R.id.editTextText)

        // Initialize Buttons
        // Make sure it matches ID in xml file
        SubmitInquiryButton = findViewById(R.id.button2)
        SubmitEmailButton = findViewById(R.id.button)
        LogOutButton = findViewById(R.id.button3)

        SubmitInquiryButton.setOnClickListener {
            // Clear the EditText value
            FirstNameEditText.text.clear()
            LastNameEditText.text.clear()
            EmailEditText.text.clear()
            MessageEditText.text.clear()
        }

        SubmitEmailButton.setOnClickListener {
            // Clear the EditText value
            NewsletterEmailEditText.text.clear()

        }

        // Create an Intent to start SecondActivity
        // CHANGE "SecondActivity" TO DESIRED SCREEN
        LogOutButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
           }


    }
}