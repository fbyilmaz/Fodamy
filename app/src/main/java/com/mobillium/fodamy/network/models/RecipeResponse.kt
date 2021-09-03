package com.mobillium.fodamy.network.models


import com.google.gson.annotations.SerializedName

data class RecipeResponse(
    @SerializedName("data")
    val `data`: List<Recipe>,
    @SerializedName("pagination")
    val pagination: Pagination
)