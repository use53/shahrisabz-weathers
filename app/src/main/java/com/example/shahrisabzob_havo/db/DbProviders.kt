package com.example.shahrisabzob_havo.db

import android.content.Context
import androidx.room.Room

class DbProviders {

    companion object{
        private var instanse:WeatherDB?=null
        fun instanse(ctx: Context):WeatherDB{
            if (instanse==null){
                instanse=Room.
                 inMemoryDatabaseBuilder(ctx,WeatherDB::class.java)
                    .allowMainThreadQueries()
                    .build()
            }else{
                instanse
            }
            return instanse!!
        }
    }
}