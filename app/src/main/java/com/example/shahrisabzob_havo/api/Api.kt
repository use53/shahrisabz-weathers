package com.example.shahrisabzob_havo.api

import com.example.shahrisabzob_havo.api.model.WeahterModel
import com.example.shahrisabzob_havo.constants.*
import io.reactivex.Single

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query



interface Api {

    @GET("data/2.5/forecast")
    fun loadApi(@Query("lat") lat:String= LAT,
                @Query("lon") lon:String= LON,
                @Query("appid") appid:String= APPID,
                @Query("units") units:String= UNITS):Single<WeahterModel>

    companion object{
        private var instanse:Api?=null
        fun instanse(): Api {
            if (instanse==null){

                val retrofit=Retrofit.Builder()
                    .baseUrl("api.openweathermap.org/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

               val  model=retrofit.create(Api::class.java)
                instanse=model
                instanse
            }else{
                instanse
            }
           return instanse!!
        }
    }
}
