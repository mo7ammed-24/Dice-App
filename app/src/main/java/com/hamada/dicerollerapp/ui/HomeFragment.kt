package com.hamada.dicerollerapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hamada.dicerollerapp.R
import com.hamada.dicerollerapp.databinding.FragmentHomeBinding
import com.hamada.dicerollerapp.viewModels.HomeFragmentViewModel

class HomeFragment:Fragment() {
    lateinit var binding:FragmentHomeBinding
    private val viewModel:HomeFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.viewModel=viewModel
        binding.lifecycleOwner=this
        return binding.root
    }

}