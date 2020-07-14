package cn.zhaojunchen.weather.logic.network


import cn.zhaojunchen.weather.App
import cn.zhaojunchen.weather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaceService {
    @GET("v2/place?query={address_name}&${App.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Path("address_name") address_name: String): Call<PlaceResponse>
}