package com.thoughtworks.ark.feature.home

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.thoughtworks.ark.feature.home.api.HomeApi
import com.thoughtworks.ark.feature.home.ui.HomeFragment
import com.thoughtworks.ark.router.annotation.ServiceImpl

@ServiceImpl
class HomeApiImpl : HomeApi {
    override fun increaseHomeCount(homeFragment: Fragment) {
        if (homeFragment is HomeFragment) {
            val homeViewModel = ViewModelProvider(homeFragment)[HomeViewModel::class.java]
            homeViewModel.increaseCount()
        }
    }
}