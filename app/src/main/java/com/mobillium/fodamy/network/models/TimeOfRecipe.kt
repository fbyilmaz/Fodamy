package com.mobillium.fodamy.network.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimeOfRecipe(
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
): Parcelable