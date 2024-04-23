package com.tqi.challenge.pix.web.response

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Customers
import lombok.Data

@Data
data class CustomerResponse(
    var customer: String,
    val name: String,
    val cpf: String,
    val email: String,
    val phone: String,
    val account: List<Accounts>,
)

fun Customers.toCustomerResponse() =
    CustomerResponse(
        customer = this.customer,
        name = this.name,
        cpf = this.cpf,
        email = this.email,
        phone = this.phone,
        account = this.account,
    )
