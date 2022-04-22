package com.oceanbrasil.ocean_android_recyclerview_multithread_22_04_2022

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter(val itens: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return itens.count()
    }
}
