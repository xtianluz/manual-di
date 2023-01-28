package com.example.googleapi

import com.example.googleapi.screen.data.SearchRepository
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkRepositoryTest {
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun networkTest_getItems_verifyList() = run {
        runTest {
            val repository = SearchRepository(
                searchApiService = FakeApiService()
            )
            assertEquals(FakeDataSource.fakeSearchDataModel, repository.getSearchItems("fake thumbnail"))
        }
    }
}