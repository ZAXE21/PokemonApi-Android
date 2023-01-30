package com.example.pokemonapi.data

import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.data.network.PokemonService

class PokemonRepository {

    private val api = PokemonService()

    suspend fun getAllPokemon(): List<PokemonData> {
        return api.getAllPokemon()
    }

}