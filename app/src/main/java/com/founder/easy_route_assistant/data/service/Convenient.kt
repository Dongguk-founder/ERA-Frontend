package com.founder.easy_route_assistant.data.service

import com.founder.easy_route_assistant.data.model.response.ResponseConvenientList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface Convenient {
    @GET("convenient/get-{convenientType}")
    fun getConvenientList(
        @Header("jwt") accessToken: String,
        @Path("convenientType") type: String,
    ): Call<ResponseConvenientList?>
}
