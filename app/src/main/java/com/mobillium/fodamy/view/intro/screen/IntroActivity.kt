package com.mobillium.fodamy.view.intro.screen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.mobillium.fodamy.R
import com.mobillium.fodamy.view.auth.AuthActivity
import com.mobillium.fodamy.databinding.ActivityIntroBinding
import com.mobillium.fodamy.view.intro.adapter.IntroPagerAdapter

// TODO activity_intro.xml dosyasındaki buton, icon gibi tasarımsal öğeler düzenlenecek.
class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding
    private var isLastPage = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_intro
        )

        binding.viewPager.adapter = IntroPagerAdapter()
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        binding.imageClose.setOnClickListener {
            goToAuthActivity()
        }
        binding.buttonNext.setOnClickListener {
            val page = binding.viewPager.currentItem
            if (isLastPage) {
                goToAuthActivity()
            }
            if (page < 3) {
                binding.viewPager.currentItem = page + 1
            }

        }

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 3) {
                    isLastPage = true
                    binding.buttonNext.text = getString(R.string.screen_intro_start)
                } else {
                    isLastPage = false
                    binding.buttonNext.text = getString(R.string.screen_intro_next)


                }
            }
        })

    }
    private fun goToAuthActivity (){
        val intent = Intent(this, AuthActivity :: class.java)
        startActivity(intent)
    }
}