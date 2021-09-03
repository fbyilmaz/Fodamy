package com.mobillium.fodamy.network.models


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: Image?,
    @SerializedName("language")
    val language: String,
    @SerializedName("main_category_id")
    val mainCategoryId: Any?,
    @SerializedName("name")
    val name: String
)