package com.example.urbandictionary.Term

import com.example.urbandictionary.Term.Term
import com.google.gson.annotations.SerializedName

//data class == struct
data class DefineTermResponse(
    @SerializedName("list")
    val terms: List<Term>
)

