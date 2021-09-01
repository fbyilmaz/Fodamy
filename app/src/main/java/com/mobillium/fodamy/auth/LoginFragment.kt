package com.mobillium.fodamy.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mobillium.fodamy.R
import com.mobillium.fodamy.databinding.FragmentLoginBinding

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

        return binding.root
    }


    fun openRegisterFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RegisterFragment())
            .commit()
    }
}
