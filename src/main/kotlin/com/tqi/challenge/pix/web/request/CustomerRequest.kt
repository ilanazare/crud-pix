package com.tqi.challenge.pix.web.request

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Customers
import lombok.Data

@Data
data class CustomerRequest(
    val customer: String,
    val name: String,
    val cpf: String,
    val email: String,
    val phone: String,
    val account: List<Accounts>?,
)

fun CustomerRequest.toCustomerRequest() =
    Customers(
        customer,
        name,
        cpf,
        email,
        phone,
        account,
    )
