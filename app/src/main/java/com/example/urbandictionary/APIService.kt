package com.example.urbandictionary

import com.example.urbandictionary.Term.DefineTermResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIService {
    // https://mashape-community-urban-dictionary.p.rapidapi.com/define?term=wat
    //"x-rapidapi-host": "mashape-community-urban-dictionary.p.rapidapi.com",
    //	"x-rapidapi-key": "d8d142955fmsh8130ef73fb925acp1dc3c8jsn4bebde195210"

    @Headers(
        "x-rapidapi-host: mashape-community-urban-dictionary.p.rapidapi.com",
        "x-rapidapi-key: d8d142955fmsh8130ef73fb925acp1dc3c8jsn4bebde195210"
    )

    @GET("define")
    //suspend == @escaping
    suspend fun defineTerm(
        @Query("term")
        term: String
    ): DefineTermResponse
}