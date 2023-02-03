package com.example.pokemonapi.data

import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.data.network.PokemonService
import com.example.pokemonapi.ui.view.PokedexView
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val api: PokemonService) {
    suspend fun getAllPokemon(): List<PokemonData> {
        return api.getAllPokemon()
    }

    suspend fun getPokedex(region: Int): List<PokemonData> {
        return api.getPokedex(region)
    }
}