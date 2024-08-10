package com.example.mortgagecalculator

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import android.widget.Toast

class MainActivity : ComponentActivity() {
    private lateinit var btnSubmit: Button
    private lateinit var btnResetPassword: Button
    private lateinit var etPass: EditText
    private lateinit var etUser: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        btnSubmit = findViewById(R.id.submitButton)
        btnResetPassword = findViewById(R.id.resetButton)
        etPass = findViewById(R.id.editTextTextPassword)
        etUser = findViewById(R.id.editTextTextEmailAddress)

//        // Set onClickListener for the submit button
//        btnSubmit.setOnClickListener(this)
//        btnResetPassword.setOnClickListener(this)
    }

//    override fun onClick(view: View?) {
//        when (view?.id) {
//            R.id.submitButton -> saveCredentials()
//            R.id.resetButton -> submitInquiry()
//            // Handle other button clicks if needed
//        }
//    }
//
//    private fun submitInquiry(){
//        val intent = Intent (this, PersonalInfo:: class.java)
//        startActivity((intent))
//    }

//    private fun saveCredentials() {
//        val sharedPref = getSharedPreferences("UserCredentials", Context.MODE_PRIVATE)
//        val editor = sharedPref.edit()
//
//        val email = etUser.text.toString()
//        val password = etPass.text.toString()
//
//        if ((email.length in 4..11) && password.length > 5) {
//            Toast.makeText(this, "Signing on..", Toast.LENGTH_SHORT).show()
//
//            // Save the data in SharedPreferences
//            editor.putString("username", email)
//            editor.putString("password", password)
//            editor.apply()
//
//            // Navigate to PersonalInfoActivity
//            val intent = Intent(this, PersonalInfo::class.java)
//            startActivity(intent)
//        } else {
//            Toast.makeText(this, "Error! Try Again.", Toast.LENGTH_SHORT).show()
//        }
//    }
}
