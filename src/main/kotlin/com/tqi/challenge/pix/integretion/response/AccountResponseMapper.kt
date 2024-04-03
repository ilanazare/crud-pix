package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.entity.Accounts
import com.tqi.challenge.pix.web.response.AccountsResponse

fun Accounts.toAccountResponse(): AccountsResponse? =
    this.pixType?.let {
        this.pixKey?.let { it1 ->
            AccountsResponse(
            customer = this.customer,
            bank = this.bank,
            agency = this.agency,
            account = this.account,
            pixType = it,
            pixKey = it1,
        )
        }
    }
