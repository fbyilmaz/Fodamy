package com.mobillium.fodamy.view.intro.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mobillium.fodamy.R


enum class IntroModel(
    @StringRes val title: Int,
    @StringRes val desc: Int,
    @DrawableRes val image: Int
) {
    // DONE Aşağıdaki intro ekranları için text ve drawable dosyaları setlenecek.
    INTRO_1(R.string.screen_intro1_title, R.string.screen_intro1_desc, R.drawable.walkthrough_image1),
    INTRO_2(R.string.screen_intro2_title, R.string.screen_intro1_desc, R.drawable.walkthrough_image2),
    INTRO_3(R.string.screen_intro3_title, R.string.screen_intro1_desc, R.drawable.walkthrough_image3),
    INTRO_4(R.string.screen_intro4_title, R.string.screen_intro1_desc, R.drawable.walkthrough_image4)
}