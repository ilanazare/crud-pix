package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.entity.Payment
import com.tqi.challenge.pix.web.response.PaymentResponse

fun Payment.toInfoKeyResponse(): PaymentResponse =
    PaymentResponse(
        account = this.account,
        pixType = this.pixType,
        pixKey = this.pixKey,
    )
