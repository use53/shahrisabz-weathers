package com.example.shahrisabzob_havo.api

import com.example.shahrisabzob_havo.api.model.WeahterModel
import com.example.shahrisabzob_havo.db.DbModel
import com.example.shahrisabzob_havo.db.WeatherDao
import io.reactivex.Single

class RepoistoriyaImpl (private val api:Api,private val weatherDao: WeatherDao)
    :IMainActivtiy{


    override fun Iweather(): Single<DbModel> {

        return Single.fromCallable{
            val world=api.loadApi().blockingGet()
            val modelapi= DbModel(world.list[0].main.temp,
                world.list[0].main.tempMax,
                world.list[0].main.tempMin,
                world.list[0].dtTxt,
                world.list[0].weather[0].main,
                world.list[0].weather[0].icon)

            weatherDao.insert(modelapi)
            modelapi

        }



    }
}