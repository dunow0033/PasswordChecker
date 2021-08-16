package com.example.passwordchecker

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.passwordchecker.databinding.PasswordFieldBinding

class FragmentLogin : Fragment(R.layout.password_field) {

    private var _binding: PasswordFieldBinding? = null
    private var binding: PasswordFieldBinding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = PasswordFieldBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var passwordTextLength = binding.passwordBox.text.length
        with(binding){
            if(passwordTextLength > 3) {
                uppercase.setTypeface(null, Typeface.BOLD)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}