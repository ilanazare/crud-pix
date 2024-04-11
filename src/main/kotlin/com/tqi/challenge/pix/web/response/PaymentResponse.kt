package com.tqi.challenge.pix.web.response

import lombok.Data

@Data
data class PaymentResponse(
    val customer: String,
    val account: String,
    val pixType: String,
    val pixKey: String,
)
