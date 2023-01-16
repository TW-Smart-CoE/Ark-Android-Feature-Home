package com.thoughtworks.ark.feature.home.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thoughtworks.ark.feature.home.api.HomeSchemes
import com.thoughtworks.ark.router.Router
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Router.scheme(HomeSchemes.HOME).route(this)
    }
}