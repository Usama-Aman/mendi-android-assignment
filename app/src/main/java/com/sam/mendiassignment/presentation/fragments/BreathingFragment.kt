package com.sam.mendiassignment.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sam.mendiassignment.databinding.FragmentBreathingBinding

class BreathingFragment : Fragment() {

    private lateinit var binding: FragmentBreathingBinding


    companion object {
        fun newInstance(): BreathingFragment {
            return BreathingFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBreathingBinding.inflate(layoutInflater, container, false)


        return binding.root
    }
}