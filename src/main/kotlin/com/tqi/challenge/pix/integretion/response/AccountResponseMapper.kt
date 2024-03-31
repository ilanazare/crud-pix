package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.entity.Accounts
import com.tqi.challenge.pix.web.response.AccountsResponse

fun Accounts.toAccountResponse(): AccountsResponse =
    AccountsResponse(
        id = this.id,
        customer = this.customer,
        bank = this.bank,
        agency = this.agency,
        account = this.account,
        infoKey = this.infoKey,
    )
