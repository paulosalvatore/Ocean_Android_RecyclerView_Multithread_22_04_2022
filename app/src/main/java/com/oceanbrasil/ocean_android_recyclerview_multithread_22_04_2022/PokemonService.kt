package com.oceanbrasil.ocean_android_recyclerview_multithread_22_04_2022

import com.oceanbrasil.ocean_android_recyclerview_multithread_22_04_2022.PokemonApiResult
import retrofit2.Call
import retrofit2.http.GET

interface PokemonService {
    @GET("pokemon")
    fun listarPokemon(): Call<PokemonApiResult>
}