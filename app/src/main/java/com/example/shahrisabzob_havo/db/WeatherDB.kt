package com.example.shahrisabzob_havo.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DbModel::class],version = 1)
abstract class WeatherDB (): RoomDatabase(){
    abstract fun weatherDao():WeatherDao
}