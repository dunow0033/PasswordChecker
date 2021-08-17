package com.example.passwordchecker

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.passwordchecker.databinding.PasswordFieldBinding

class FragmentLogin : Fragment() {

    private var _binding: PasswordFieldBinding? = null
    private var binding: PasswordFieldBinding = _binding!!

    var uppercase: TextView = binding.uppercase
    var password: EditText = binding.passwordBox

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


        password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                uppercase.setTextColor(Color.BLUE)
                uppercase.setTypeface(null, Typeface.BOLD)
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                uppercase.setTextColor(Color.BLUE)
                uppercase.setTypeface(null, Typeface.BOLD)
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}