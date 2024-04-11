package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.entity.Payment
import com.tqi.challenge.pix.service.PaymentService
import io.swagger.v3.oas.annotations.parameters.RequestBody
import org.springframework.web.bind.annotation.*

@RestController
class PaymentController(
    private val paymentService: PaymentService,
) {
    @GetMapping("/payment/{customer}")
    fun findPaymentByAccount(
        @PathVariable customer: String,
    ): List<Payment> = paymentService.findListPaymentByCustomer(customer)

    @PostMapping("/payment")
    fun create(
        @RequestBody request: Payment,
    ) {
        return paymentService.create(request)
    }
}
