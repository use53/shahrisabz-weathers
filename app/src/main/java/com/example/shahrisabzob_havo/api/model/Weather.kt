package com.example.shahrisabzob_havo.api.model


import com.google.gson.annotations.SerializedName

data class Weather(
    val description: String,
    val icon: String,
    val id: Double,
    val main: String
)