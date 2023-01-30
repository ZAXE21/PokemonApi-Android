package com.example.pokemonapi.data.network

import com.example.pokemonapi.data.model.PokemonData
import com.example.pokemonapi.data.model.mapperToPokemonData
import com.example.pokemonapi.utils.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAllPokemon(): List<PokemonData>{
        return withContext(Dispatchers.IO){
            var result: List<PokemonData> = emptyList()
            val response = retrofit.create(APIService::class.java).getAllPokemons("pokemon?limit=151/")
            if(response.isSuccessful){
                val pokemonResponse = response.body()
                val list = pokemonResponse?.pokemons ?: emptyList()
                result = mapperToPokemonData(list)
            }
            result
        }
    }
}