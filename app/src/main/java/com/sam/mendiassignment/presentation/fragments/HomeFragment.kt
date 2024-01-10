package com.sam.mendiassignment.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.google.android.material.slider.Slider
import com.google.android.material.slider.Slider.OnSliderTouchListener
import com.sam.mendiassignment.R
import com.sam.mendiassignment.databinding.FragmentHomeBinding
import com.sam.mendiassignment.presentation.MainViewModel
import com.sam.mendiassignment.utils.Utility

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: MainViewModel by activityViewModels()

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        initListeners()

        return binding.root
    }

    private fun initListeners() {
        binding.btnLetsGo.setOnClickListener {
            Utility.replaceFragment(
                activity = requireActivity() as AppCompatActivity,
                fragmentContainer = R.id.fragmentContainer,
                fragment = BreathingFragment.newInstance(),
                isBackStack = true
            )
        }

        binding.slider.addOnSliderTouchListener(object : OnSliderTouchListener{
            override fun onStartTrackingTouch(slider: Slider) {
                println("Start: ${slider.value}")
            }

            override fun onStopTrackingTouch(slider: Slider) {
                println("Stop: ${slider.value}")
            }

        })
    }


}