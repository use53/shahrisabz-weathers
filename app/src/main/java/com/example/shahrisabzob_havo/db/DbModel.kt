package com.example.shahrisabzob_havo.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shahrisabzob_havo.api.model.X

@Entity
class DbModel(
    val temp_HH: Double,
    val temp_max:Double,
    val temp_min:Double,
    val date_txt:String,
    val main_weather:String,
    val icon:String,
    @PrimaryKey(autoGenerate = true)
    val id:Long=0
)