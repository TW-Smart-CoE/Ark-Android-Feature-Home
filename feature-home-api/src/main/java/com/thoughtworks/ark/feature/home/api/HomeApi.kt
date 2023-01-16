package com.thoughtworks.ark.feature.home.api

import androidx.fragment.app.Fragment
import com.thoughtworks.ark.router.annotation.Service

@Service
interface HomeApi {
    fun getHomeFragment(): Fragment
}