package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.entity.InfoKey
import lombok.Data

@Data
data class AccountsResponse(
    val id: Int,
    val customer: String,
    val bank: String,
    val agency: String,
    val account: String,
    val infoKey: List<InfoKey>,
)
