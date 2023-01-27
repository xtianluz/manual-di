package com.example.googleapi.screen.data

import com.example.googleapi.screen.model.SearchDataModel
import com.example.googleapi.screen.network.SearchApiService

interface SearchRepositoryInterface {
    suspend fun getSearchItems(input: String): SearchDataModel
}

class SearchRepository(private val searchApiService: SearchApiService) : SearchRepositoryInterface {
    override suspend fun getSearchItems(input: String): SearchDataModel {
        return searchApiService.getItems(input)
    }
}