package com.example.pokemonapi.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.databinding.ItemPokemonBinding
import com.example.pokemonapi.utils.loadUrl
import com.example.pokemonapi.utils.setNamePokemon

class PokemonAdapter(
    private val listPokemon: MutableList<PokemonData>,
    private val listener: OnClickPokemon):
    RecyclerView.Adapter<PokemonAdapter.PokemonAdapterViewHolder>(){

    private var listFiltered: MutableList<PokemonData> = listPokemon
    private var listOriginal: MutableList<PokemonData> = listPokemon


    interface OnClickPokemon {
        fun onClickItem(item:PokemonData)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonAdapterViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonAdapterViewHolder(binding)
    }

    override fun getItemCount(): Int = listFiltered.size

    override fun onBindViewHolder(holder: PokemonAdapterViewHolder, position: Int) {
        val pokemon = listPokemon[holder.adapterPosition]

        holder.image.loadUrl(pokemon.image)
        holder.imageShiny.loadUrl(pokemon.imageShiny)
        holder.name.setNamePokemon(pokemon.id.toString(),pokemon.name)

    }

    inner class PokemonAdapterViewHolder(binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val name = binding.namePokemon
        val image = binding.imagePokemon
        val imageShiny = binding.imagePokemonShiny
        val cardPokemon = binding.itemPokemon


    }

}