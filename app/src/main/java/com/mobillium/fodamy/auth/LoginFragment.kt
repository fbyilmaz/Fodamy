package com.mobillium.fodamy.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.mobillium.fodamy.R

class LoginFragment : Fragment() {

    // TODO Binding kullanılacak. fragment_login.xml ve buradaki değişiklikler yapılmalı.

    // TODO fragment_login.xml tasarımı tamamlanacak. Örnek olarak email için alan eklendi.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)


        val nameEditText = view.findViewById<TextInputEditText>(R.id.editTextEmail)
        val loginButton = view.findViewById<Button>(R.id.buttonLogin)

        // Şimdilik örnek için butona tıklayınca, ekrana edittext değeri basılıyor.
        loginButton.setOnClickListener {
            Toast.makeText(context,nameEditText.text, Toast.LENGTH_SHORT).show()
        }

        return view
    }
}