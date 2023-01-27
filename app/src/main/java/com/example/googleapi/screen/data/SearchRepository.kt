package com.example.googleapi.screen.data

import com.example.googleapi.screen.model.SearchDataModel
import com.example.googleapi.screen.network.SearchApiService

//interface SearchRepository {
//    suspend fun getSearchItems(input: String): SearchDataModel
//}

//class SearchRepositoryClass  {
//    override suspend fun getSearchItems(input: String): SearchDataModel {
//        return BookSearchApi.retrofitService.getItems(input)
//    }
//}

interface SearchRepositoryInterface {
    suspend fun getSearchItems(input: String): SearchDataModel
}

class SearchRepository(private val searchApiService: SearchApiService) : SearchRepositoryInterface {
    override suspend fun getSearchItems(input: String): SearchDataModel {
        return searchApiService.getItems(input)
    }
}