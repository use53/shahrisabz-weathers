package com.example.shahrisabzob_havo.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.Single

@Dao
interface WeatherDao{

    @Insert
    fun insert(dbModel: DbModel):Long


  /*  @Query("select * from dbmodel")
    fun readBaza():Single<MutableList<DbModel>>*/


    @Query("select * from dbmodel where id=:newId")
    fun firsrBaza(newId:Long):LiveData<DbModel>
}