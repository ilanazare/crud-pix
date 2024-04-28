package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.service.PaymentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payment")
class PaymentController(
    private val paymentService: PaymentService,
) {
    @GetMapping("/{customer}")
    fun findPaymentByAccount(
        @PathVariable customer: String,
    ): List<Payment> = paymentService.findListPaymentByCustomer(customer)
}
