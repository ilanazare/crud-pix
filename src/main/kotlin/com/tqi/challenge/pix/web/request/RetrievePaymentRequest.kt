package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.domain.enum.PaymentTypeEnum
import lombok.Data

@Data
data class RetrievePaymentRequest(
    val customer: String,
    val account: String,
    val pixType: PaymentTypeEnum,
    val pixKey: String,
)

fun RetrievePaymentRequest.toPaymentRequest() =
    Payment(
        customer,
        account,
        pixType,
        pixKey,
    )
