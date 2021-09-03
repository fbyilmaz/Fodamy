package com.mobillium.fodamy.view.recipe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobillium.fodamy.databinding.RecipeItemLayoutBinding
import com.mobillium.fodamy.network.models.Recipe


/**
 * Created by Akın DEMİR on 3.09.2021.
 * Copyright (c) 2021
 */


class RecipeAdapter(private val recipeList: MutableList<Recipe> = mutableListOf()): RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(private val binding: RecipeItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(recipe: Recipe) {
            with(binding) {
                textView9.text = recipe.user.username
                textView10.text = "${recipe.user.recipeCount} Tarif ${recipe.user.followedCount} Takipçi"
                textView11.text = recipe.title
                textView12.text = recipe.category.name
                textViewComment.text = "${recipe.commentCount} Yorum ${recipe.likeCount} Beğeni"

                with(Glide.with(binding.root)) {
                    load(recipe.images[0].url).into(imageViewRecipe).clearOnDetach()
                    load(recipe.user.image?.url).into(imageViewProfile).clearOnDetach()
                }
                imageViewFeatured.visibility = if (recipe.isEditorChoice) View.VISIBLE else View.GONE
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeViewHolder {
        val binding = RecipeItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: RecipeViewHolder,
        position: Int
    ) {
        holder.bind(recipeList[position])
    }

    override fun getItemCount(): Int {
       return recipeList.size
    }
}