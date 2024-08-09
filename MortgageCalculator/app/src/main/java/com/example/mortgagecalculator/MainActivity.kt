package com.example.mortgagecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private lateinit var FirstNameTextView: TextView
    private lateinit var LastNameTextView: TextView
    private lateinit var EmailTextView: TextView
    private lateinit var MessageTextView: TextView
    private lateinit var Newsletter1TextView: TextView
    private lateinit var Newsletter2TextView: TextView

    private lateinit var FirstNameEditText: EditText
    private lateinit var LastNameEditText: EditText
    private lateinit var EmailEditText: EditText
    private lateinit var MessageEditText: EditText
    private lateinit var NewsletterEmailEditText: EditText

    private lateinit var SubmitInquiryButton: Button
    private lateinit var SubmitEmailButton: Button
    private lateinit var LogOutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirstNameTextView = findViewById(R.id.textView6)
        LastNameTextView = findViewById(R.id.textView7)
        EmailTextView = findViewById(R.id.textView8)
        MessageTextView = findViewById(R.id.textView9)
        Newsletter1TextView = findViewById(R.id.textView10)
        Newsletter2TextView = findViewById(R.id.textView11)


        FirstNameEditText = findViewById(R.id.editTextText3)
        LastNameEditText = findViewById(R.id.editTextText4)
        EmailEditText = findViewById(R.id.editTextText5)
        MessageEditText = findViewById(R.id.editTextText6)
        NewsletterEmailEditText = findViewById(R.id.editTextText7)

        SubmitInquiryButton = findViewById(R.id.button3)
        SubmitEmailButton = findViewById(R.id.button6)
        LogOutButton = findViewById(R.id.button7)

        SubmitInquiryButton.setOnClickListener {
            val firstName = FirstNameEditText.text.toString()
            val lastName = LastNameEditText.text.toString()
            val email = EmailEditText.text.toString()
            val message = MessageEditText.text.toString()

            val userInquiry = mapOf(
                "firstName" to firstName,
                "lastName" to lastName,
                "email" to email,
                "message" to message
            )
        }


        SubmitEmailButton.setOnClickListener {
            val newsletterEmail = NewsletterEmailEditText.text.toString()

            val newsEmail = mapOf(
                "newsletterEmail" to newsletterEmail
            )
        }

        LogOutButton.setOnClickListener {
        }
    }
}
