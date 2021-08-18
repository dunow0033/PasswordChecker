package com.example.passwordchecker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.passwordchecker.databinding.FragmentPasswordBinding

class FragmentLogin : Fragment() {

    private var _binding: FragmentPasswordBinding? = null
    private var binding: FragmentPasswordBinding = _binding!!

    private lateinit var viewModel: PasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(PasswordViewModel::class.java)

        with(binding){

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}