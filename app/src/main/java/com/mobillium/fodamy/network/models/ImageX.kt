package com.mobillium.fodamy.network.models


import com.google.gson.annotations.SerializedName

data class ImageX(
    @SerializedName("height")
    val height: Int,
    @SerializedName("key")
    val key: String,
    @SerializedName("order")
    val order: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)