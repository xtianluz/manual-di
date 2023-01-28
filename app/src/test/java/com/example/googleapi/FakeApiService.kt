package com.example.googleapi

import com.example.googleapi.screen.model.SearchDataModel
import com.example.googleapi.screen.network.SearchApiService

class FakeApiService: SearchApiService {
    override suspend fun getItems(input: String): SearchDataModel {
        return FakeDataSource.fakeSearchDataModel
    }
}