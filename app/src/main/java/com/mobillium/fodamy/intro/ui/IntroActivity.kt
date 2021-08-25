package com.mobillium.fodamy.intro.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.mobillium.fodamy.R
import com.mobillium.fodamy.databinding.ActivityIntroBinding
import com.mobillium.fodamy.intro.adapter.IntroPagerAdapter

// TODO activity_intro.xml dosyasındaki buton, icon gibi tasarımsal öğeler düzenlenecek.
class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_intro)

        binding.viewPager.adapter = IntroPagerAdapter()
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        binding.buttonNext.setOnClickListener {
            binding.viewPager.beginFakeDrag()
            binding.viewPager.fakeDragBy(-10f)
            binding.viewPager.endFakeDrag()
        }
    }
}