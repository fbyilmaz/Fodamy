package com.mobillium.fodamy.view.recipe

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


/**
 * Created by Akın DEMİR on 3.09.2021.
 * Copyright (c) 2021
 */


class RecipeBindingAdapter {

    companion object {

        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: ImageView, url: String) {
            Glide.with(view.context).load(url).into(view)
        }
    }
}