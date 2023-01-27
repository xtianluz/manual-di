package com.example.googleapi.screen.model


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.googleapi.screen.data.SearchRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

sealed interface BookSearchUiState {
    data class Success(val searchedItems: List<String>) : BookSearchUiState
    object Error: BookSearchUiState
    object  Loading: BookSearchUiState
}

class BookSearchViewModel(private val searchRepository: SearchRepository) : ViewModel(){

    var searchUiState: BookSearchUiState by mutableStateOf(BookSearchUiState.Loading)
        private set

    var userInput by mutableStateOf("")
        private set

    var thumbnailList: MutableList<String> = mutableListOf()

    fun updateUserInput(newUserInput: String){
        userInput = newUserInput
    }

    fun getSearch(){
//        thumbnailList.clear()
//        getSearchItems()
        runBlocking {
            val result = searchRepository.getSearchItems(userInput)
            val items = result.items
            println(items)
        }
    }

    private fun getSearchItems(){
        searchUiState = BookSearchUiState.Loading
        viewModelScope.launch(Dispatchers.IO) {
//            try{
//                val searchRepository = SearchRepositoryClass()
//                val result = searchRepository.getSearchItems(userInput)
//                val items = result.items
//                items?.forEach { i -> i.volumeInfo?.imageLinks?.thumbnail?.replace("http", "https")?.let { thumbnailList.add(it)} }
//                searchUiState = BookSearchUiState.Success(thumbnailList)
//
//            } catch (e: HttpException){
//                searchUiState = BookSearchUiState.Error
//            }
        }
    }
}


