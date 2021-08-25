package com.mobillium.fodamy.intro.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mobillium.fodamy.R


/**
 * Created by Akın DEMİR on 25.08.2021.
 * Copyright (c) 2021
 */


enum class IntroModel(
    @StringRes val title: Int,
    @StringRes val desc: Int,
    @DrawableRes val image: Int
) {
    //TODO Aşağıdaki intro ekranları için text ve drawable dosyaları setlenecek.
    INTRO_1(R.string.screen_intro1_title, R.string.screen_intro1_desc, R.drawable.ic_temp),
    INTRO_2(R.string.screen_intro2_title, R.string.screen_intro1_desc, R.drawable.ic_temp),
    INTRO_3(R.string.screen_intro3_title, R.string.screen_intro1_desc, R.drawable.ic_temp),
    INTRO_4(R.string.screen_intro4_title, R.string.screen_intro1_desc, R.drawable.ic_temp)
}