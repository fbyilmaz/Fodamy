package com.mobillium.fodamy.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobillium.fodamy.R

/**
 * Bu activity'yi Login, Register ve ilişkili ekranları kontrol etmek için kullanacağız.
 * Her bir ekran fragment olarak tasarlanacak.
 */
class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

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
            .add(R.id.fragmentContainer, LoginFragment())
            .commit()
    }
}