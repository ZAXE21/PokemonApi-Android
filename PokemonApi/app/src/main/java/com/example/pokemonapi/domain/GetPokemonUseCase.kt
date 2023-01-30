package com.example.pokemonapi.domain

import com.example.pokemonapi.data.PokemonRepository

class GetPokemonUseCase {

    private val repository = PokemonRepository()

    suspend operator fun invoke() = repository.getAllPokemon()
}