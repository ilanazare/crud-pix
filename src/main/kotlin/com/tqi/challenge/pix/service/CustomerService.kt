package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.entity.Customers
import com.tqi.challenge.pix.integretion.response.toCustomerResponse
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.request.RetrieveCustomerRequest
import com.tqi.challenge.pix.web.request.toCustomerRequest
import com.tqi.challenge.pix.web.response.CustomerResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService(
    @Autowired
    val database: CustomerRepository,
) {
    fun findCustomerById(id: Int): CustomerResponse = database.findCustomerById(id).toCustomerResponse()

//    fun findCustomerInfoByCustomer(customer: String): List<CustomerInfoDTO> = database.findCustomersAndAccountsByCustomer(customer)

    fun create(entity: Customers): RetrieveCustomerRequest? = database.save(entity).toCustomerRequest()
}
