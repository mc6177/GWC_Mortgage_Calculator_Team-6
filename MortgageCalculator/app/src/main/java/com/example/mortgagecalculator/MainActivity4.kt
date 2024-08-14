package com.example.mortgagecalculator

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.cardview.widget.CardView
import android.os.Bundle
import android.widget.Button

//Declare UI components so we can initalize
private lateinit var LogOutButton: Button

class MainActivity4 : ComponentActivity() {  // Extending ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)  // Using the correct syntax for the layout resource

        //Initalize Buttons
        LogOutButton = findViewById(R.id.pg4LogOutButton)

        //Click on Listener Button
        LogOutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}
