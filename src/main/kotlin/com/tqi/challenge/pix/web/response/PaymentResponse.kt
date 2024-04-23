package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.domain.entity.Payment
import lombok.Data

@Data
data class PaymentResponse(
    val customer: String,
    val account: String,
    val pixType: String,
    val pixKey: String,
)

fun Payment.toPaymentResponse() =
    PaymentResponse(
        customer = this.customer,
        account = this.account,
        pixType = this.pixType,
        pixKey = this.pixKey,
    )
