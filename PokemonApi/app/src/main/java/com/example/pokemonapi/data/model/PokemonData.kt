package com.example.pokemonapi.data.model

data class PokemonData(
    val id: Int,
    val name: String,
    val image: String,
    val imageShiny: String
)

fun mapperToPokemonData(list: List<InfoPokemon>): MutableList<PokemonData> {
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
