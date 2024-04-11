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
    fun findListPaymentByCustomer(customer: String): List<Payment> = paymentRepository.findListPaymentByCustomer(customer)

    fun updatePaymentByCustomer(entity: Payment): Payment {
        if (paymentRepository.findPaymentByCustomer(entity.customer).equals(null)) {
            paymentRepository.save(entity)
        }
        throw Exception()
    }

    fun create(entity: Payment): Unit = paymentRepository.save(entity)
}
