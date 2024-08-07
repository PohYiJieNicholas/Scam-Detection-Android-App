package com.example.scamdetection.apiCall

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://scam-detection-zf4ey5dwtq-as.a.run.app/")  // Use 10.0.2.2 for localhost in the emulator
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}