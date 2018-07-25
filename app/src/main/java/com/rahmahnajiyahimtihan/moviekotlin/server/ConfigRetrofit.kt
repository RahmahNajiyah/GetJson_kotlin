package com.rahmahnajiyahimtihan.moviekotlin.server

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class ConfigRetrofit {

    var retrofit = Retrofit.Builder()
            .baseUrl("https://maps.googleapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
    //api service sebuah interface maka untk merequest api service kita buat dia mnjd interface
}