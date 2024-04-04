package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.entity.Payment
import com.tqi.challenge.pix.service.PaymentService
import com.tqi.challenge.pix.web.response.PaymentResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PaymentController(
    private val paymentService: PaymentService,
) {
    @GetMapping("/payment/{customer}")
    fun findPaymentByAccount(
        @PathVariable customer: String,
    ): List<Payment> = paymentService.findPaymentByCustomer(customer)
}
