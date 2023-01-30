package com.example.pokemonapi.domain

import com.example.pokemonapi.data.PokemonRepository
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(private val repository: PokemonRepository) {
    suspend operator fun invoke() = repository.getAllPokemon()
}