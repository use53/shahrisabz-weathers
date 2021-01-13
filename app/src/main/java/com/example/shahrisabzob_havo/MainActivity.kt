package com.example.shahrisabzob_havo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.shahrisabzob_havo.api.WorldViewModel
import com.example.shahrisabzob_havo.db.DbProviders
import com.example.shahrisabzob_havo.db.WeatherDB
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //val viewModelProvider=ViewModelProviders.of(this)[WorldViewModel::class.java]
    private val dao:WeatherDB by lazy { DbProviders.instanse(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val viewModelProvider=ViewModelProvider(this)[WorldViewModel::class.java]

        viewModelProvider.search(this)

        dao.weatherDao().firsrBaza(0)
            .observe(this, {
                temp_hh.text=it.temp_HH.toString()
                temp_max.text=it.temp_max.toString()
                hh_mm.text=it.date_txt
            })



  /*      val bottonNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController=findNavController(R.id.fragment)

        bottonNavigationView.setupWithNavController(navController)*/

    }
}
