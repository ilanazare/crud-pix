package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.domain.entity.User

data class UserResponse(
    var customer: String,
    val email: String,
    val password: String,
    val role: String,
)

fun User.toUserResponse() =
    UserResponse(
        customer = this.customer,
        email = this.email,
        password = this.password,
        role = this.role,
    )
