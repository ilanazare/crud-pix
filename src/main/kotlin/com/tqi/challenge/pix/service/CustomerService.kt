package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.entity.Customers
import com.tqi.challenge.pix.exception.CustomerNotFoundException
import com.tqi.challenge.pix.integretion.response.toCustomerResponse
import com.tqi.challenge.pix.integretion.response.toGetCustomerResponse
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.response.CustomerResponse
import com.tqi.challenge.pix.web.response.GetCustomerResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService(
    @Autowired
    val database: CustomerRepository,
) {
    fun findCustomerByCustomer(customer: String): GetCustomerResponse = database.findCustomerByCustomer(customer).toGetCustomerResponse()

    fun create(request: Customers): CustomerResponse = database.save(request).toCustomerResponse()

    fun update(request: Customers): CustomerResponse? =
        database.save(request).toCustomerResponse().takeIf {
            findCustomerByCustomer(request.customer).equals(request.customer)
        } ?: throw CustomerNotFoundException("Customer not found")
}
