package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.entity.Payment
import lombok.Data

@Data
data class AccountsResponse(
    val customer: String,
    val bank: String,
    val agency: String,
    val account: String,
    val payment: List<Payment>?
)
