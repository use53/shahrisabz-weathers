package com.example.shahrisabzob_havo.api

import com.example.shahrisabzob_havo.api.model.WeahterModel
import com.example.shahrisabzob_havo.db.DbModel
import io.reactivex.Single

interface IMainActivtiy{
    fun Iweather():Single<DbModel>
}