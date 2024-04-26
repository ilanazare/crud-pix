package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.domain.enum.BankAccountEnum

data class AccountRequest(
    val customer: String,
    val bank: BankAccountEnum,
    val agency: String,
    val account: String,
    val payment: List<Payment>?,
)

fun AccountRequest.toAccountRequest() =
    Accounts(
        customer,
        bank,
        agency,
        account,
        payment,
    )
