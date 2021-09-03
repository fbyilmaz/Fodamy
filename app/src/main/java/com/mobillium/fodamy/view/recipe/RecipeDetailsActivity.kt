package com.mobillium.fodamy.view.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mobillium.fodamy.R
import com.mobillium.fodamy.databinding.ActivityRecipeDetailsBinding
import com.mobillium.fodamy.databinding.RecipeDetailLayoutBinding

class RecipeDetailsActivity : AppCompatActivity() {

    private lateinit var binding: RecipeDetailLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.recipe_detail_layout
        )

        intent?.let {
            binding.recipe =  it.getParcelableExtra("data")
        }
    }
}