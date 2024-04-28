package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.exception.PaymentNotFoundException
import com.tqi.challenge.pix.repository.PaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PaymentService(
    @Autowired
    val paymentRepository: PaymentRepository,
) {
    fun findListPaymentByCustomer(customer: String) =
        paymentRepository.findListPaymentByCustomer(customer)
            .takeIf { it.isNotEmpty() } ?: throw PaymentNotFoundException("Payment not found for customer, $customer")
}
