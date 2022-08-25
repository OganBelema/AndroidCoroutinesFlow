package com.devtides.androidcoroutinesflow.repository

import com.devtides.androidcoroutinesflow.network.NewsService
import com.devtides.androidcoroutinesretrofit.model.NewsArticle
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService){

    fun getNewsArticles(): Flow<NewsArticle> {
        return flow {
            val newsSource = newsService.fetchNews()
            newsSource.forEach {
                emit(it)
                delay(NEWS_DELAY)
            }
        }
    }

    companion object {
        private const val NEWS_DELAY = 2000L
    }
}