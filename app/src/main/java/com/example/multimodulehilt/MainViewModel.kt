package com.example.multimodulehilt

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.GetSomeDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getSomeDataUseCase: GetSomeDataUseCase
): ViewModel() {

    fun getSomeData() {
        viewModelScope.launch {
            val resp = getSomeDataUseCase.getSomeData()
            Log.d("apple", resp.toString())
        }
    }

}