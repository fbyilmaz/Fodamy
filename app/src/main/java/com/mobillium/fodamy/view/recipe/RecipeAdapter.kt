package com.mobillium.fodamy.view.recipe

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobillium.fodamy.databinding.RecipeItemLayoutBinding
import com.mobillium.fodamy.network.models.Recipe


/**
 * Created by Akın DEMİR on 3.09.2021.
 * Copyright (c) 2021
 */


class RecipeAdapter(private val recipeList: MutableList<Recipe> = mutableListOf()) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(private val binding: RecipeItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(recipe: Recipe) {
            with(binding) {
                setRecipe(recipe)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecipeViewHolder {
        val binding =
            RecipeItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: RecipeViewHolder,
        position: Int
    ) {
        holder.bind(recipeList[position])
        holder.itemView.setOnClickListener {

            with(holder.itemView.context) {
                Toast.makeText(this, recipeList[position].title, Toast.LENGTH_SHORT).show()
                this.startActivity(Intent(this, RecipeDetailsActivity::class.java).putExtra("data", recipeList[position]))
            }
        }
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }
}