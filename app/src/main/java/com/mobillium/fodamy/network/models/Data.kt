package com.mobillium.fodamy.network.models


import com.google.gson.annotations.SerializedName

data class Recipe(
    @SerializedName("category")
    val category: Category,
    @SerializedName("comment_count")
    val commentCount: Int,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("difference")
    val difference: String,
    @SerializedName("directions")
    val directions: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: List<ImageX>,
    @SerializedName("ingredients")
    val ingredients: String,
    @SerializedName("is_approved")
    val isApproved: Boolean,
    @SerializedName("is_editor_choice")
    val isEditorChoice: Boolean,
    @SerializedName("is_owner")
    val isOwner: Boolean,
    @SerializedName("language")
    val language: String,
    @SerializedName("like_count")
    val likeCount: Int,
    @SerializedName("number_of_favorite_count")
    val numberOfFavoriteCount: Int,
    @SerializedName("number_of_person")
    val numberOfPerson: NumberOfPerson,
    @SerializedName("time_of_recipe")
    val timeOfRecipe: TimeOfRecipe,
    @SerializedName("title")
    val title: String,
    @SerializedName("user")
    val user: User,
    @SerializedName("youtube_image")
    val youtubeImage: Any?,
    @SerializedName("youtube_url")
    val youtubeUrl: String
)