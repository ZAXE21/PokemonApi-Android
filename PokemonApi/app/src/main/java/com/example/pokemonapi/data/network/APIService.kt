package com.example.pokemonapi.data.network

import com.example.pokemonapi.data.model.ResponseData
import com.example.pokemonapi.test.Prueba
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getAllPokemon(@Url url:String): Response<ResponseData>

    @GET
    suspend fun getInfoPokemon(@Url url:String): Response<Prueba>
}
