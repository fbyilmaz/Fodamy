package com.mobillium.fodamy.view.auth

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mobillium.fodamy.R
import com.mobillium.fodamy.databinding.ActivityAuthBinding

/**
 * Bu activity'yi Login, Register ve ilişkili ekranları kontrol etmek için kullanacağız.
 * Her bir ekran fragment olarak tasarlanacak.
 */
class AuthActivity : AppCompatActivity() {
    lateinit var binding : ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_auth)

        Log.d("Fatih","AuthActivity onCreate")
        openLoginFragment()


    }

    // TODO RegisterFragment oluştur. Tasarımını bitir. Binding kullan.

    // TODO Alttakine benzer şekilde, RegisterFragment task'ı bittikten sonra openRegisterFragment() fonksiyonu yazılacak.

    // TODO ForgotPasswordFragment oluştur. Tasarımını bitir. Binding kullan.

    // TODO openForgotPasswordFragment fonksiyonu yaz.

    // TODO Ekranlarda Üye ol, Giriş Yap, Şifremi unuttum tıklanınca ilgili openXXXFragment() fonksiyonunu çağır.

    // TODO 3 tane benzer yapıda openXXXFragment() fonksiyonu oldu. Bunu tek fonksiyonda halledebilir miyiz?
    fun openLoginFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, LoginFragment())
            .commit()
    }

    fun openRegisterFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, RegisterFragment())
            .commit()
    }

    fun openForgotPasswordFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, ForgotPasswordFragment())
            .commit()
    }
}