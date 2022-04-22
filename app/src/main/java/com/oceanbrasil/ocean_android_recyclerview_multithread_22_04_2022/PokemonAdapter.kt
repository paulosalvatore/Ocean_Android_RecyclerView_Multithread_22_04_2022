package com.oceanbrasil.ocean_android_recyclerview_multithread_22_04_2022

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PokemonAdapter(val itens: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon, position: Int) = with(itemView) {
            val tvNome = findViewById<TextView>(R.id.tvNome)
            val ivPokemon = findViewById<ImageView>(R.id.ivPokemon)

            tvNome.text = item.name

            val numero = position + 1
            val numeroComTresDigitos = numero.toString().padStart(3, '0')
            val nomeArquivo = "$numeroComTresDigitos.png"
            val urlImagem = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$nomeArquivo"

            Glide.with(this).load(urlImagem).into(ivPokemon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val view = layoutInflater.inflate(R.layout.pokemon_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder.bindView(item, position)
    }

    override fun getItemCount(): Int {
        return itens.count()
    }
}
