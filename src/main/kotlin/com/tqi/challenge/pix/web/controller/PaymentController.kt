package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.entity.Payment
import com.tqi.challenge.pix.service.PaymentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PaymentController(
    private val paymentService: PaymentService
) {
    @GetMapping("/payment/{account}")
    fun findPayment(
        @PathVariable account: String,
    ): Optional<Payment> = paymentService.findPaymentByAccount(account)
}