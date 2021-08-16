package com.example.passwordchecker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.passwordchecker.databinding.PasswordFieldBinding

class FragmentLogin : Fragment() {

    private var _binding: PasswordFieldBinding? = null
    private var binding: PasswordFieldBinding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = PasswordFieldBinding.inflate(inflater, container, savedInstanceState)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}