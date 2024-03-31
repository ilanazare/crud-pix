package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.entity.InfoKey
import com.tqi.challenge.pix.web.response.InfoKeyResponse

fun InfoKey.toInfoKeyResponse(): InfoKeyResponse =
    InfoKeyResponse(
        id = this.id,
        customer = this.customer,
        account = this.account,
        pixType = this.pixType,
        pixKey = this.pixKey,
    )
