package com.example.imageviewer.auth.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.imageviewer.auth.data.models.OnBoarding
import com.example.imageviewer.auth.presentation.adapter.OnBoardingPageAdapter
import com.example.imageviewer.databinding.OnBoardingFragmentBinding
import com.example.imageviewer.databinding.RegistrationFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class RegistrationFragment: Fragment() {

    private var _binding: RegistrationFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = RegistrationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}