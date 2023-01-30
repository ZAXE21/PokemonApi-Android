package com.example.pokemonapi.test

import com.google.gson.annotations.SerializedName

data class Other(
    val dream_world: DreamWorld,
    val home: Home,
    @SerializedName("official-artwork")val official_artwork: OfficialArtwork
)