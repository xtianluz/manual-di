package com.example.googleapi

import androidx.compose.runtime.Composable
import com.example.googleapi.screen.booksearch.BookSearchScreen
import com.example.googleapi.screen.model.BookSearchViewModel

@Composable
fun BookSearchApp(searchViewModel: BookSearchViewModel){
    BookSearchScreen(searchViewModel)
}