package com.example.pokemonapi.data.network

import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.data.model.mapperToPokemonData
import com.example.pokemonapi.data.model.mapperToPokemonData2
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PokemonService @Inject constructor(private val api: APIService) {

    suspend fun getAllPokemon(): List<PokemonData>{
        return withContext(Dispatchers.IO){
            var result: List<PokemonData> = emptyList()
            try {
                val response = api.getAllPokemon("pokemon?limit=151/")
                if(response.isSuccessful){
                    val pokemonResponse = response.body()
                    val list = pokemonResponse?.pokemons ?: emptyList()
                    result = mapperToPokemonData2(list)
                }
            }catch (e: java.lang.Exception){
                e.printStackTrace()
            }
            result
        }
    }

    suspend fun getPokedex(region: Int): List<PokemonData>{
        return withContext(Dispatchers.IO){
            var result: List<PokemonData> = emptyList()
            try {
                val response = api.getPokedex("pokedex/$region/")
                if(response.isSuccessful){
                    val pokedexResponse = response.body()
                    val list = pokedexResponse?.pokemon_entries?: emptyList()
                    result = mapperToPokemonData(list)
                }
            }catch (e: java.lang.Exception){
                e.printStackTrace()
            }
            result
        }
    }
}