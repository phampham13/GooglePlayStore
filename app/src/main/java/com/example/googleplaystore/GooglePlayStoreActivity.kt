package com.example.googleplaystore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.GPSCategoryAdapter
import com.example.googleplaystore.GPSCategoryModel
import com.example.googleplaystore.GPSItemModel
import com.example.myandroidexercise.R

class GooglePlayStoreActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gps_view)

        val allItems = arrayListOf<GPSCategoryModel>()

        repeat(10){
            var cate: GPSCategoryModel = GPSCategoryModel("my apps $it", ArrayList<GPSItemModel>())
            repeat(10){
                cate.items.add(GPSItemModel("app $it", "3"))
            }
            allItems.add(cate)
        }

        val adapter = GPSCategoryAdapter(allItems)
        val recyclerView: RecyclerView = findViewById(R.id.gps_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}