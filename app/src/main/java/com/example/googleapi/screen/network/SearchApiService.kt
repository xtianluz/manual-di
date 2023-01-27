package com.example.googleapi.screen.network

import com.example.googleapi.screen.model.SearchDataModel
import retrofit2.http.GET
import retrofit2.http.Query

//private const val GOOGLE_URL = "https://www.googleapis.com/books/v1/"
//
//@OptIn(ExperimentalSerializationApi::class)
//private val json = Json {
//    ignoreUnknownKeys = true
//    isLenient = true
//    explicitNulls = false
//    encodeDefaults = false
//}
//
//private val contentType = "application/json".toMediaType()
//
//@OptIn(ExperimentalSerializationApi::class)
//private val retrofit = Retrofit.Builder()
//    .addConverterFactory(json.asConverterFactory(contentType))
//    .baseUrl(GOOGLE_URL)
//    .build()

interface SearchApiService {
    @GET("volumes/")
    suspend fun getItems(@Query("q") input: String) : SearchDataModel
}

//object BookSearchApi {
//    val retrofitService: SearchApiService by lazy {
//        retrofit.create(SearchApiService::class.java)
//    }
//}