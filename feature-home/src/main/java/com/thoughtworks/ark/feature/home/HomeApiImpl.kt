package com.thoughtworks.ark.feature.home

import androidx.fragment.app.Fragment
import com.thoughtworks.ark.feature.home.api.HomeApi
import com.thoughtworks.ark.feature.home.ui.HomeFragment
import com.thoughtworks.ark.router.annotation.ServiceImpl

@ServiceImpl
class HomeApiImpl : HomeApi {
    override fun getHomeFragment(): Fragment {
        return HomeFragment()
    }
}