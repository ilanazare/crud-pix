package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.web.response.AccountsResponse

fun Accounts.toAccountResponse(): AccountsResponse =
    AccountsResponse(
        customer = this.customer,
        bank = this.bank,
        agency = this.agency,
        account = this.account,
        payment = this.payment,
    )
