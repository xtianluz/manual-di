package com.example.googleapi.screen.data

import androidx.lifecycle.ViewModelProvider
import com.example.googleapi.screen.model.BookSearchViewModel
import com.example.googleapi.screen.network.SearchApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

class AppContainer {
    private val GOOGLE_URL = "https://www.googleapis.com/books/v1/"
    private val json = Json{
        ignoreUnknownKeys = true
        isLenient = true
        explicitNulls = false
        encodeDefaults = false
    }
    private val contentType = "application/json".toMediaType()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(json.asConverterFactory(contentType))
        .baseUrl(GOOGLE_URL)
        .build()

    private val retrofitService: SearchApiService by lazy {
        retrofit.create(SearchApiService::class.java)
    }

    class BookSearchViewModelFactory(private val searchRepository: SearchRepository) : ViewModelProvider.Factory {
        fun create(): BookSearchViewModel {
            return BookSearchViewModel(searchRepository)
        }
    }

    val searchRepository by lazy {
        SearchRepository(retrofitService)
    }
}