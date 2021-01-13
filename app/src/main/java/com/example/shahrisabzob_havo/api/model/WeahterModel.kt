package com.example.shahrisabzob_havo.api.model


import com.google.gson.annotations.SerializedName

data class WeahterModel(
    val city: City,
    val cnt: Double,
    val cod: String,
    val list: List<X>,
    val message: Double
)