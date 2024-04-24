package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.domain.enum.BankAccountEnum
import lombok.Data

@Data
data class AccountsResponse(
    val customer: String,
    val bank: BankAccountEnum,
    val agency: String,
    val account: String,
    val payment: List<Payment>?,
)

fun Accounts.toAccountResponse() =
    AccountsResponse(
        customer = this.customer,
        bank = this.bank,
        agency = this.agency,
        account = this.account,
        payment = this.payment,
    )
