package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.entity.Accounts
import com.tqi.challenge.pix.entity.Customers

data class RetrieveCustomerRequest(
    val customer: String,
    val name: String,
    val cpf: String,
    val email: String?,
    val phone: String?,
    val account: List<Accounts>?,
)

fun Customers.toCustomerRequest(): RetrieveCustomerRequest =
    RetrieveCustomerRequest(
        customer,
        name,
        cpf,
        email,
        phone,
        account,
    )
