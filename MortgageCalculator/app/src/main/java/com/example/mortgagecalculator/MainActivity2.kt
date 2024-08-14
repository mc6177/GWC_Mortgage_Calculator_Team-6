package com.example.mortgagecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mortgagecalculator.databinding.ActivityMain2Binding


class MainActivity2 : ComponentActivity() {

    private lateinit var binding: ActivityMain2Binding //initalize binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)

        // Initialize view binding
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample data
        val houseList = listOf(
            HouseAdapter.House(R.drawable.house1, "12 Calvary Ct, MD", "$899,900"),
            HouseAdapter.House(R.drawable.house2, "1208 Scotts Knoll Ct, MD", "$9,000,000"),
            HouseAdapter.House(R.drawable.house3, "2209 Chapel Valley Ln, MD", "$449,900")
        )
        // Set up RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = HouseAdapter(houseList)

    }
    // Data class for House
    data class House(
        val imageUrl: String,
        val location: String,
        val price: String
    )
}

