package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.service.CustomerService
import com.tqi.challenge.pix.web.request.CustomerRequest
import com.tqi.challenge.pix.web.request.toCustomerRequest
import com.tqi.challenge.pix.web.response.CustomerResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController(
    val service: CustomerService,
) {
    @GetMapping("/{customer}")
    fun findCustomerByCustomer(
        @PathVariable customer: String,
    ): CustomerResponse = service.findCustomerByCustomer(customer)

    @PostMapping
    fun create(
        @RequestBody request: CustomerRequest,
    ): CustomerResponse? {
        return service.create(request.toCustomerRequest())
    }

    @PutMapping
    fun update(
        @RequestBody request: CustomerRequest,
    ): String {
        return service.update(request.toCustomerRequest())
    }
}
