package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.entity.Customers
import com.tqi.challenge.pix.web.response.CustomerResponse

fun Customers.toCustomerResponse(): CustomerResponse =
    CustomerResponse(
        id = this.id,
        customer = this.customer,
        name = this.name,
        cpf = this.cpf,
        email = this.email,
        phone = this.phone,
        account = this.account,
    )
