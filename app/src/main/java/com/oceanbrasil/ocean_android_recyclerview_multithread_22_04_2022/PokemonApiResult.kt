package com.oceanbrasil.ocean_android_recyclerview_multithread_22_04_2022

data class PokemonApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)

data class Pokemon(
    val name: String,
    val url: String
)
