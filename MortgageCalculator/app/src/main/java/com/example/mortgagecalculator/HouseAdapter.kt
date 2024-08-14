package com.example.mortgagecalculator

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mortgagecalculator.databinding.Pg2ItemHouseBinding

class HouseAdapter(private val houses: List<House>) : RecyclerView.Adapter<HouseAdapter.HouseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
        val binding = Pg2ItemHouseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HouseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
        holder.bind(houses[position])
    }

    override fun getItemCount(): Int = houses.size

    inner class HouseViewHolder(private val binding: Pg2ItemHouseBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(house: House) {
            binding.houseImage.setImageResource(house.imageResId)  // Set the image dynamically
            binding.houseLocation.text = house.location
            binding.housePrice.text = house.price

            // Set click listener for the card view
            binding.root.setOnClickListener {
                val context = binding.root.context
                val intent = Intent(context, MainActivity3::class.java)

                // Pass data to the new activity
                intent.putExtra("house_location", house.location)
                intent.putExtra("house_price", house.price)
                intent.putExtra("house_image_res_id", house.imageResId) //  pass the image resource ID

                context.startActivity(intent)
            }
        }
    }

    // House data class
    data class House(
        val imageResId: Int,  // Use resource ID for the image
        val location: String,
        val price: String
    )
}


//class HouseAdapter(private val houses: List<House>) : RecyclerView.Adapter<HouseAdapter.HouseViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
//        val binding = Pg2ItemHouseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return HouseViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
//        holder.bind(houses[position])
//    }
//
//    override fun getItemCount(): Int = houses.size
//
//    inner class HouseViewHolder(private val binding: Pg2ItemHouseBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(house: House) {
//            binding.houseImage.setImageResource(house.imageResId)
//            binding.houseLocation.text = house.location
//            binding.housePrice.text = house.price
//
//        // Set click listener for the card view
//            binding.root.setOnClickListener {
//                val context = binding.root.context
//                val intent = Intent(context, MainActivity3::class.java)
//
//                // Pass data to the new activity
//                intent.putExtra("house_location", house.location)
//                intent.putExtra("house_price", house.price)
//
//                context.startActivity(intent)
//            }
//
//        }
//    }
//
//    // House data class (need for class House)
//    data class House(
//        val imageResId: Int,
//        val location: String,
//        val price: String
//    )
//}
