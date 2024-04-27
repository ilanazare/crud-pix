package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Customers
import com.tqi.challenge.pix.exception.CustomerNotFoundException
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.response.CustomerResponse
import com.tqi.challenge.pix.web.response.toCustomerResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService(
    @Autowired
    val database: CustomerRepository,
) {
    fun findCustomerByCustomer(customer: String) =
        try {
            database.findCustomerByCustomer(customer).toCustomerResponse()
        } catch (e: Exception) {
            throw CustomerNotFoundException("Customer not found $customer")
        }

    fun create(request: Customers): CustomerResponse = database.save(request).toCustomerResponse()

    fun update(request: Customers) =
        try {
            val customer = findCustomerByCustomer(request.customer).customer

            database.save(request).toCustomerResponse().takeIf {
                it.customer == customer
            }
        } catch (e: Exception) {
            throw CustomerNotFoundException("Error condition for customer update")
        }
}
