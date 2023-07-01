package com.example.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api.php/964450498106636/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName:String):Response<SuperHeroDataResponse>
}