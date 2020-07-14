package cn.zhaojunchen.weather.logic.model

import com.google.gson.annotations.SerializedName

/** 解析地址 Gson*/
data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String) {
    override fun toString(): String {
        return "$lng,$lat"
    }
}