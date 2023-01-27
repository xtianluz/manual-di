package com.example.googleapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.googleapi.screen.SearchApplication
import com.example.googleapi.screen.model.BookSearchViewModel
import com.example.googleapi.ui.theme.GoogleApiTheme

class MainActivity : ComponentActivity() {

    private lateinit var bookSearchViewModel: BookSearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appContainer = (application as SearchApplication).appContainer
//        bookSearchViewModel = BookSearchViewModel(appContainer.searchRepository)
        bookSearchViewModel = appContainer.bookSearchViewModelFactory.create()

        setContent {
            GoogleApiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BookSearchApp(bookSearchViewModel)
                }
            }
        }
    }
}