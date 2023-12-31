package com.sportstalk.sdk.model.user

@kotlinx.serialization.Serializable
data class CreateUpdateUserRequest(
    val userid: String,
    val handle: String? = null,
    val displayname: String? = null,
    val pictureurl: String? = null,
    val profileurl: String? = null
)