package com.example.tugasmodul5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Alpen Berry Strawberry Milk Liquid 100ml",
        "Aunty Ernie’s Hazelnut Milk Liquid 100ml",
        "Roti Susun Liquid 100ml",
        "Subcreme Red Velvet Liquid 100ml",
        "King Of Clouds Liquid 100ml",
        "Rispek Liquid 60ml",
        "Blunanarilla Liquid 100ml",
        "Cereal Killa Liquid 100ml",
        "Chicken Dinner XL Furry Shake Liquid 100ML"

    )
    val desc = arrayOf(
        "Harga Rp.155.000",
        "Harga Rp.155.000",
        "Harga Rp.165.000",
        "Harga Rp.135.000",
        "Harga Rp.170.000",
        "Harga Rp.115.000",
        "Harga Rp.170.000",
        "Harga Rp.170.000",
        "Harga Rp.165.000"

    )
    val gambar = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager (this)
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i), desc.get(i), gambar.get(i)))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter


            }
        }
    }
}

