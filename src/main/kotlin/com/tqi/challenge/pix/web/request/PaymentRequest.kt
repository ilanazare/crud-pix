package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.domain.enum.PaymentTypeEnum
import lombok.Data

@Data
data class PaymentRequest(
    val customer: String,
    val account: String,
    val pixType: PaymentTypeEnum,
    val pixKey: String,
)

fun PaymentRequest.toPaymentRequest() =
    Payment(
        customer,
        account,
        pixType,
        pixKey,
    )
