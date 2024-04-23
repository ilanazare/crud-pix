package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.domain.entity.Customers
import com.tqi.challenge.pix.web.response.GetCustomerResponse

fun Customers.toGetCustomerResponse(): GetCustomerResponse =
    GetCustomerResponse(
        customer = this.customer,
        name = this.name,
        cpf = this.cpf,
        email = this.email,
        phone = this.phone,
        account = this.account,
    )
