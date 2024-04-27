package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.service.CustomerService
import com.tqi.challenge.pix.web.request.CustomerRequest
import com.tqi.challenge.pix.web.request.toCustomerRequest
import com.tqi.challenge.pix.web.response.CustomerResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController(
    val service: CustomerService,
) {
    @GetMapping("/{customer}")
    fun findCustomerByCustomer(
        @PathVariable customer: String,
    ) = service.findCustomerByCustomer(customer)

    @PostMapping
    fun create(
        @RequestBody request: CustomerRequest,
    ): CustomerResponse? {
        return service.create(request.toCustomerRequest())
    }

    @PutMapping
    fun update(
        @RequestBody request: CustomerRequest,
    ) = service.update(request.toCustomerRequest())
}
