package com.mobillium.fodamy.network

import com.mobillium.fodamy.network.models.RecipeResponse
import retrofit2.Call
import retrofit2.http.GET


/**
 * Created by Akın DEMİR on 31.08.2021.
 * Copyright (c) 2021
 */


interface FodamyApi {
    @GET("recipe")
    fun getRecipes() : Call<RecipeResponse>
}