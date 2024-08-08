package com.example.mortgagecalculator

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import android.widget.Toast

class MainActivity : ComponentActivity(), View.OnClickListener {
    // Declare UI components
    private lateinit var btnSubmit: Button
    private lateinit var btnCreateAccount: Button
    private lateinit var btnResetPassword: Button
    private lateinit var etPass: EditText
    private lateinit var etUser: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        btnSubmit = findViewById(R.id.submitButton)  // Ensure the ID here matches the XML
        btnCreateAccount = findViewById(R.id.createButton)
        btnResetPassword = findViewById(R.id.resetButton)
        etPass = findViewById(R.id.editTextTextPassword)
        etUser = findViewById(R.id.editTextTextEmailAddress)

        // Set onClickListener for the submit button
        btnSubmit.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.submitButton -> saveCredentials()
            // Add other button cases here if needed
        }
    }

    // Method to save credentials
    private fun saveCredentials() {
        val sharedPref = getSharedPreferences("UserCredentials", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        // Get user input from EditTexts
        val email = etUser.text.toString()
        val password = etPass.text.toString()

        // Save the data in SharedPreferences
        editor.putString("username", email)
        editor.putString("password", password)
        editor.apply()

        Toast.makeText(this, "Logging in..", Toast.LENGTH_SHORT).show()

    }
}