package com.devtides.androidcoroutinesflow.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.devtides.androidcoroutinesflow.repository.NewsRepository
import javax.inject.Inject

class ListViewModelFactory @Inject constructor(
    private val repository: NewsRepository): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ListViewModel(repository) as T
    }
}