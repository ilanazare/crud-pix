package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.entity.Payment
import com.tqi.challenge.pix.repository.PaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PaymentService(
    @Autowired
    val paymentRepository: PaymentRepository,
) {
    fun findPaymentByCustomer(customer: String): List<Payment> = paymentRepository.findPaymentByCustomer(customer)
}
