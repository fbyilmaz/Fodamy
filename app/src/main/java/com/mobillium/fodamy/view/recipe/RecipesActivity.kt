package com.mobillium.fodamy.view.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.mobillium.fodamy.R
import com.mobillium.fodamy.databinding.ActivityRecipesBinding
import com.mobillium.fodamy.network.ApiClient
import com.mobillium.fodamy.network.FodamyApi
import com.mobillium.fodamy.network.models.RecipeResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecipesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_recipes
        )

        getRecipes()
    }

    fun getRecipes() {
        val client = ApiClient.getClient().create(FodamyApi::class.java)
        val request = client.getRecipes()

        request.enqueue(object: Callback<RecipeResponse> {
            override fun onResponse(
                call: Call<RecipeResponse>,
                response: Response<RecipeResponse>
            ) {
                val recipes = response.body() as RecipeResponse
                Log.d("RETROFIT_RESPONSE", recipes.data[0].ingredients)

                binding.rvRecipe.adapter = RecipeAdapter(recipeList = recipes.data.toMutableList())
            }

            override fun onFailure(
                call: Call<RecipeResponse>,
                t: Throwable
            ) {
                Log.d("RETROFIT_RESPONSE", t.localizedMessage)
            }

        })

    }
}