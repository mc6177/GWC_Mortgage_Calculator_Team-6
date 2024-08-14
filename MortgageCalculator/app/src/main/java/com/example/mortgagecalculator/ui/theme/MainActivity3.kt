package com.example.mortgagecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity3:ComponentActivity() {
    //Declare UI components
    private lateinit var HouseImageView: ImageView
    private lateinit var HouseCaptionTextView: TextView
    private lateinit var LoanAmountEditText: EditText
    private lateinit var DPEditText: EditText
    private lateinit var LoanAmountTextView: TextView
    private lateinit var DPTextView: TextView
    private lateinit var CalculateButton: Button
    private lateinit var LoanDurationTextView: TextView
    private lateinit var LoanDurationEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Initialize Components
        // Make sure it matches ID in xml file
//        HouseImageView = findViewById(R.id.imageView3)
        HouseCaptionTextView = findViewById(R.id.textView7)
        LoanAmountEditText = findViewById(R.id.editTextText6)
        DPEditText = findViewById(R.id.editTextText7)
        LoanAmountTextView = findViewById(R.id.textView8)
        DPTextView = findViewById(R.id.textView9)
        CalculateButton = findViewById(R.id.button4)
        LoanDurationTextView = findViewById(R.id.textView10)
        LoanDurationEditText = findViewById(R.id.editTextText8)

        CalculateButton.setOnClickListener {
            // Get the user input
            val LoanAmount = LoanAmountEditText.text.toString()
            val DPAmount = DPEditText.text.toString()
            val LoanDuration = LoanDurationEditText.text.toString()

            // Create an Intent to start SecondActivity
            // CHANGE "SecondActivity" TO DESIRED SCREEN
            val intent = Intent(this, MainActivity4::class.java)

            // Pass the user input to the SecondActivity
            intent.putExtra("LOAN_AMOUNT", LoanAmount)
            intent.putExtra("DP_AMOUNT", DPAmount)
            intent.putExtra("LOAN_DURATION", LoanDuration)

            // Start SecondActivity
            startActivity(intent)
        }

        // M CHanges: Retrieve the data passed from MainActivity2
        val houseLocation = intent.getStringExtra("house_location")
        val housePrice = intent.getStringExtra("house_price")
        val houseImageResId = intent.getIntExtra("house_image_res_id", R.drawable.house1)

        // Example of setting this data to a TextView
        val locationTextView: TextView = findViewById(R.id.locationTextView)
        val priceTextView: TextView = findViewById(R.id.priceTextView)
        val houseImageView: ImageView = findViewById(R.id.houseImage)

        locationTextView.text = houseLocation
        priceTextView.text = housePrice
        houseImageView.setImageResource(houseImageResId)
}
}