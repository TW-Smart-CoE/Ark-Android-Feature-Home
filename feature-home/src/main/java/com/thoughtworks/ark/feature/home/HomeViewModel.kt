package com.thoughtworks.ark.feature.home

import android.content.Context
import androidx.lifecycle.ViewModel
import com.thoughtworks.ark.feature.dashboard.api.DashboardApi
import com.thoughtworks.ark.router.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

data class HomeUiState(val label: String, val count: Int = 0)

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState(label = "This is home Fragment"))
    val uiState = _uiState.asStateFlow()

    fun increaseCount() {
        _uiState.update {
            it.copy(count = it.count + 1)
        }
    }

    fun showToast(context: Context) {
        val dashboardApi = Router.service<DashboardApi>()
        dashboardApi.showToast(context, "This is a toast from home!")
    }
}
