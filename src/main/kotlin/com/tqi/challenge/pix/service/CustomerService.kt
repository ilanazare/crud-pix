package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.entity.Customers
import com.tqi.challenge.pix.integretion.response.toCustomerResponse
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.response.CustomerResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService(
    @Autowired
    val database: CustomerRepository,
) {
    fun findCustomerByCustomer(customer: String): CustomerResponse = database.findCustomerByCustomer(customer).toCustomerResponse()

    fun create(request: Customers): CustomerResponse = database.save(request).toCustomerResponse()
}
