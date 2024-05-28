package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.User

data class UserRequest(
    var customer: String,
    val email: String,
    val password: String,
    val role: String,
)

fun UserRequest.toUser() =
    User(
        customer = this.customer,
        email = this.email,
        password = this.password,
        role = this.role,
    )
