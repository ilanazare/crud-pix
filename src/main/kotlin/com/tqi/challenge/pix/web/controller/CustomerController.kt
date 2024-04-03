package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.entity.Customers
import com.tqi.challenge.pix.service.CustomerService
import com.tqi.challenge.pix.web.request.RetrieveCustomerRequest
import com.tqi.challenge.pix.web.response.CustomerResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(
    val service: CustomerService,
) {
    @GetMapping("/customer/{customer}")
    fun findCustomerByCustomer(
        @PathVariable customer: String,
    ): CustomerResponse = service.findCustomerBuCustomer(customer)

//    @GetMapping("/customer/customer_info/{customer}")
//    fun findCustomerInfoByCustomer(
//        @PathVariable customer: String,
//    ): List<CustomerInfoDTO> = service.findCustomerInfoByCustomer(customer)

    @PostMapping
    fun create(
        @RequestBody request: Customers,
    ): RetrieveCustomerRequest? {
        return service.create(request)
    }
}
