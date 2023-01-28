package com.example.googleapi

import com.example.googleapi.screen.model.ImageLinks
import com.example.googleapi.screen.model.Items
import com.example.googleapi.screen.model.SearchDataModel
import com.example.googleapi.screen.model.VolumeInfo

object FakeDataSource {
    private val fakeImageLinks = ImageLinks("fake thumbnail")
    private val fakeVolumeInfo = VolumeInfo(fakeImageLinks)
    private val fakeItems = listOf(
        Items(
            volumeInfo = fakeVolumeInfo
        )
    )
    val fakeSearchDataModel: SearchDataModel = SearchDataModel(fakeItems)
}