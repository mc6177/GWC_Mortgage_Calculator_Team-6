package com.example.mortgagecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mortgagecalculator.ui.theme.MortgageCalculatorTheme
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : ComponentActivity(), View.OnClickListener {
    lateinit var btnSubmit : Button
    lateinit var btnCreateAccount:  Button
    lateinit var btnResetPassword: Button
    lateinit var etPass: EditText
    lateinit var etUser: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}

