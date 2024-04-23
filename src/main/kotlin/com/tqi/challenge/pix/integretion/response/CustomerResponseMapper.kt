package com.tqi.challenge.pix.integretion.response

import com.tqi.challenge.pix.domain.entity.Customers
import com.tqi.challenge.pix.web.response.CustomerResponse

fun Customers.toCustomerResponse(): CustomerResponse =
    CustomerResponse(
        customer = this.customer,
    )
