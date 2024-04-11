package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.entity.Customers
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

    fun update(request: Customers): String {
        val customer = findCustomerByCustomer(request.customer).customer
        database.save(request).toCustomerResponse().takeIf {
            it.customer == customer
        }
        return customer
    }
}
