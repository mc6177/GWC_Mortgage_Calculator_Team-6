package com.example.mortgagecalculator


// Importing UI components from Android SDK
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import android.widget.TextView


class PersonalInfo : ComponentActivity() {
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
        setContentView(R.layout.activity_personal_info)

        // Initialize TextView
        // Make sure it matched ID in xml file
        FirstNameTextView = findViewById(R.id.textView6)
        LastNameTextView = findViewById(R.id.textView7)
        EmailTextView = findViewById(R.id.textView8)
        MessageTextView = findViewById(R.id.textView9)
        Newsletter1TextView = findViewById(R.id.textView10)
        Newsletter2TextView = findViewById(R.id.textView11)

        // Initialize EditText
        // Make sure it matched ID in xml file
        FirstNameEditText = findViewById(R.id.editTextText3)
        LastNameEditText = findViewById(R.id.editTextText4)
        EmailEditText = findViewById(R.id.editTextText5)
        MessageEditText = findViewById(R.id.editTextText6)
        NewsletterEmailEditText = findViewById(R.id.editTextText7)

        // Initialize Buttons
        // Make sure it matched ID in xml file
        SubmitInquiryButton = findViewById(R.id.button3)
        SubmitEmailButton = findViewById(R.id.button6)
        LogOutButton = findViewById(R.id.button7)


        // Set a click listener on the Button
        SubmitInquiryButton.setOnClickListener {
            // Retrieve the text from each EditText
            val firstName = FirstNameEditText.text.toString()
            val lastName = LastNameEditText.text.toString()
            val email = EmailEditText.text.toString()
            val message = MessageEditText.text.toString()

            // Store the inputs in variables, a list, or a map
            val userInquiry = mapOf(
                "firstName" to firstName,
                "lastName" to lastName,
                "email" to email,
                "message" to message
            )
            // Now the userData map contains the input data which you can use later
            // No need to show it to the user


            // Set a click listener on the Button
            SubmitEmailButton.setOnClickListener {
                // Retrieve the text from each EditText
                val newsletterEmail = NewsletterEmailEditText.text.toString()

                // Store the inputs in variables, a list, or a map
                val newsEmail = mapOf(
                    "newsletterEmail" to newsletterEmail,

                    )
            }
            //Button to switch screens when logout is pressed
            /*
             LogOutButton.setOnClickListener {
                 // Create an Intent to start SecondActivity
                 val intent = Intent(this, SecondActivity::class.java)
                 startActivity(intent)
             }*/
        }
    }
}