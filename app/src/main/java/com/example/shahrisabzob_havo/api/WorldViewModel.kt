package com.example.shahrisabzob_havo.api

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.shahrisabzob_havo.db.DbModel
import com.example.shahrisabzob_havo.db.DbProviders
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class WorldViewModel :ViewModel(){

    private val api by lazy(LazyThreadSafetyMode.NONE) { Api.instanse() }

    fun search(context: Context): Single<DbModel> {
        val dao=DbProviders.instanse(context).weatherDao()
        val repo:IMainActivtiy=RepoistoriyaImpl(api,dao)
        return repo.Iweather()
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
    }
}