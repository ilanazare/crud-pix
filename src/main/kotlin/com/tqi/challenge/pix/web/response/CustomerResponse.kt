package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.entity.Accounts
import lombok.Data

@Data
data class CustomerResponse(
    val id: Int,
    val customer: String,
    val name: String,
    val cpf: String,
    val email: String,
    val phone: String,
    val account: List<Accounts>,
)
