package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.web.response.PaymentResponse

fun Payment.toPaymentResponse(): PaymentResponse =
    PaymentResponse(
        customer = this.customer,
        account = this.account,
        pixType = this.pixType,
        pixKey = this.pixKey,
    )
