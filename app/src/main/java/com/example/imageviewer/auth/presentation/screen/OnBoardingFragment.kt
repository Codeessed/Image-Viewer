package com.example.imageviewer.auth.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.imageviewer.R
import com.example.imageviewer.auth.data.models.OnBoarding
import com.example.imageviewer.auth.presentation.adapter.OnBoardingPageAdapter
import com.example.imageviewer.databinding.OnBoardingFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingFragment: Fragment() {

    private var _binding: OnBoardingFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = OnBoardingFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.getStarted.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingFragment_to_registrationFragment)
        }
        setUpViewpager()
    }

    private fun setUpViewpager(){
        val onBoardingViewpager = binding.onBoardingViewpager
        val onBoardingAdapter = OnBoardingPageAdapter()
        onBoardingViewpager.adapter = onBoardingAdapter
        onBoardingAdapter.differList.submitList(OnBoarding.onboarding)
        binding.dotIndicator.attachTo(onBoardingViewpager)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}