package com.devtides.androidcoroutinesflow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(): ViewModel() {

    val newsArticles = MutableLiveData<String>()

}