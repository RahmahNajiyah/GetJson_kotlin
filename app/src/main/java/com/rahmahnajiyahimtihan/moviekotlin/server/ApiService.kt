package com.rahmahnajiyahimtihan.moviekotlin.server

import com.rahmahnajiyahimtihan.moviekotlin.response.ResponseMovie
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("maps/api/directions/json?origin=place_id:ChIJ685WIFYViEgRHlHvBbiD5nE&destination=place_id:ChIJA01I-8YVhkgRGJb0fW4UX7Y&key=AIzaSyC2ZB0_ntVgn7Hvwn45ACUkPeo3cUfo4nU")
    fun ambilDataMovie():Call<ResponseMovie>
}