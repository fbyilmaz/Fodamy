package com.mobillium.fodamy.network.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class Category(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: Image?,
    @SerializedName("language")
    val language: String,
    @SerializedName("main_category_id")
    val mainCategoryId: @RawValue Any? = null,
    @SerializedName("name")
    val name: String
): Parcelable