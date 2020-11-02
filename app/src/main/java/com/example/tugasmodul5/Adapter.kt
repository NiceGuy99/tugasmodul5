package com.example.tugasmodul5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val list:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.textView.text = list[position].name
        holder.view.txtdesc.text = list[position].description
        list[position].gambar.let { holder.view.imageView.setImageResource(it) }
        holder.view.setOnClickListener {
            Toast.makeText(holder.view.context, "Anda Memilih " + list.get(position).name, Toast.LENGTH_SHORT).show()
        }
            }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)


}