package com.hedrinsitorus.mandirinews.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hedrinsitorus.mandirinews.data.network.api.model.Article
import com.hedrinsitorus.mandirinews.data.repostiory.NewsRepository

class NewsViewModel : ViewModel() {
    private val repository = NewsRepository()

    fun getTopHeadlines(): LiveData<List<Article>> {
        return repository.getTopHeadlines("us")
    }

    fun getAllNews(query: String): LiveData<List<Article>> {
        return repository.getAllNews(query)
    }
}
