package com.founder.easy_route_assistant.data.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestLoginEmailDto(
    @SerialName("userID")
    val userId: String,
    @SerialName("pwd")
    val password: String,
)
