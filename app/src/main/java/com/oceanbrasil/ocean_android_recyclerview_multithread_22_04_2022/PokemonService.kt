package com.oceanbrasil.ocean_android_recyclerview_multithread_22_04_2022

import retrofit2.Call
import retrofit2.http.GET

interface PokemonService {
    @GET("pokemon?limit=100000&offset=0")
    fun listarPokemon(): Call<PokemonApiResult>
}