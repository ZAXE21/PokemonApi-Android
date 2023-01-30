package com.example.pokemonapi.data.model

import com.example.pokemonapi.data.model.InfoPokemon
import com.google.gson.annotations.SerializedName

data class ResponseData(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String,
    @SerializedName("previous") val previous: Any,
    @SerializedName("results") val pokemons: List<InfoPokemon>
)