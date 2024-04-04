package com.tqi.challenge.pix.web.response

import lombok.Data

@Data
data class PaymentResponse(
    val account: String,
    val pixType: String?,
    val pixKey: String?,
)
