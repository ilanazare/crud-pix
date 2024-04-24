package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.domain.enum.BankAccountEnum

data class RetrieveAccountRequest(
    val customer: String,
    val bank: BankAccountEnum,
    val agency: String,
    val account: String,
    val payment: List<Payment>?,
)

fun Accounts.toAccountRequest() =
    RetrieveAccountRequest(
        customer,
        bank,
        agency,
        account,
        payment,
    )
