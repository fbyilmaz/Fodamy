package com.mobillium.fodamy.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Akın DEMİR on 31.08.2021.
 * Copyright (c) 2021
 */


object ApiClient {

    private val baseUrl = "https://fodamy.mobillium.com/api/"
    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit {
        if (retrofit == null)
            retrofit =
                Retrofit.Builder().baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

        return retrofit as Retrofit
    }
}