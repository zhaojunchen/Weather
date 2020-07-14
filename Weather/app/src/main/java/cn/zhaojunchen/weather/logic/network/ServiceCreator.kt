package cn.zhaojunchen.weather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val BASE_URL = "http:..."
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    /** val appService = ServiceCreator.create(AppService::class.java)*/
    inline fun <reified T> create(): T = create(T::class.java)
    /** val appService = ServiceCreator.create<AppService>()*/
}