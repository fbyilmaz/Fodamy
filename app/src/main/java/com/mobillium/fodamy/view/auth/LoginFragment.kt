package com.mobillium.fodamy.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mobillium.fodamy.R
import com.mobillium.fodamy.databinding.FragmentLoginBinding
import com.mobillium.fodamy.view.recipe.RecipesActivity

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    // TODO Binding kullanılacak. fragment_login.xml ve buradaki değişiklikler yapılmalı.

    //  fragment_login.xml tasarımı tamamlanacak. Örnek olarak email için alan eklendi.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.textViewLoginBottom.setOnClickListener {
            openRegisterFragment()
        }

        binding.buttonLogin.setOnClickListener {
            checkCredentials()
        }

        return binding.root
    }

    fun checkCredentials() {
        var isValidEmail = false
        var isValidPassword = false
        if (binding.loginEmail.text.toString() == "test") {
            isValidEmail = true
            binding.textInputLayoutEmail.error = null
        } else {
            binding.textInputLayoutEmail.error = "Email hatalı"
        }
        if (binding.loginPassword.text.toString() == "test") {
            binding.textInputLayoutPassword.error = null
            isValidPassword = true
        } else {
            binding.textInputLayoutPassword.error = "Parola hatalı"
        }

        if (isValidEmail && isValidPassword) {
            startActivity(Intent(requireActivity(), RecipesActivity::class.java))
            requireActivity().finish()
        }
    }

    fun openRegisterFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RegisterFragment())
            .commit()
    }
}
