package com.mobillium.fodamy.network.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ImageXX(
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
): Parcelable