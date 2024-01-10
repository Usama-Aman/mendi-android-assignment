package com.sam.mendiassignment.presentation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.viewModels
import com.sam.mendiassignment.R
import com.sam.mendiassignment.presentation.fragments.HomeFragment
import com.sam.mendiassignment.utils.Utility.replaceFragment

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

        replaceFragment(
            activity = this@MainActivity,
            fragmentContainer = R.id.fragmentContainer,
            fragment = HomeFragment.newInstance(),
            isBackStack = false
        )

    }
}