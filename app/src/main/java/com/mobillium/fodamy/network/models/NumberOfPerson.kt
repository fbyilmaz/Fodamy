package com.mobillium.fodamy.network.models


import com.google.gson.annotations.SerializedName

data class NumberOfPerson(
    @SerializedName("id")
    val id: Int,
    @SerializedName("text")
    val text: String
)