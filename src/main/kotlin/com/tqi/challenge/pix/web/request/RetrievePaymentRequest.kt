package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.Payment
import lombok.Data

@Data
data class RetrievePaymentRequest(
    val customer: String,
    val account: String,
    val pixType: String,
    val pixKey: String,
)

fun RetrievePaymentRequest.toPaymentRequest() =
    Payment(
        customer,
        account,
        pixType,
        pixKey,
    )
