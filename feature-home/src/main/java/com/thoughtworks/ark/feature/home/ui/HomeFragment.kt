package com.thoughtworks.ark.feature.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.thoughtworks.ark.feature.home.api.HomeSchemes
import com.thoughtworks.ark.router.annotation.Scheme
import com.thoughtworks.ark.ui.theme.Theme
import dagger.hilt.android.AndroidEntryPoint

@Scheme(HomeSchemes.HOME)
@AndroidEntryPoint
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View = ComposeView(requireContext()).apply {
        setContent {
            Theme {
                HomeScreen()
            }
        }
    }
}