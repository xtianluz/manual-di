package com.example.googleapi.screen

import android.app.Application
import com.example.googleapi.screen.data.AppContainer

class SearchApplication : Application() {
    val appContainer = AppContainer()
}