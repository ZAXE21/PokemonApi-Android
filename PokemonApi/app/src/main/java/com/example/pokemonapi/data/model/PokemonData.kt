package com.example.pokemonapi.data.model

import com.example.pokemonapi.data.model.nuevomodelo.PokemonEntry

data class PokemonData(
    val id: Int,
    val name: String,
    val image: String,
    val imageShiny: String
)

fun mapperToPokemonData(list: List<PokemonEntry>): MutableList<PokemonData> {
    val result = mutableListOf<PokemonData>()
    list.forEach {
        val idPokemon = getId(it.pokemon_species.url)
        val urlImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${idPokemon}.png"
        val urlImageShiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/${idPokemon}.png"
        val pokemon = PokemonData(idPokemon.toInt(),it.pokemon_species.name,urlImage,urlImageShiny)
        result.add(pokemon)
    }
    return result
}

fun getId(url: String): String {
    val aux = url.split('/')
    return aux[aux.size-2]
}

fun mapperToPokemonData2(list: List<InfoPokemon>): MutableList<PokemonData> {
    var index = 1
    val result = mutableListOf<PokemonData>()
    list.forEach {
        val urlImage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$index.png"
        val urlImageShiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/$index.png"
        val pokemon = PokemonData(index,it.name,urlImage,urlImageShiny)
        result.add(pokemon)
        index++
    }
    return result
}

