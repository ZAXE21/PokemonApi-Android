package com.example.pokemonapi.domain

import com.example.pokemonapi.data.PokemonRepository
import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.ui.view.PokedexView
import javax.inject.Inject

class GetPokedexUseCase @Inject constructor(private val repository: PokemonRepository) {
    suspend operator fun invoke(id:Int): List<PokemonData>  = repository.getPokedex(id)
}