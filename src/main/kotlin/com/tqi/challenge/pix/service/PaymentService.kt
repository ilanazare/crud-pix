package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.integretion.response.toInfoKeyResponse
import com.tqi.challenge.pix.repository.PaymentRepository
import com.tqi.challenge.pix.web.response.PaymentResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PaymentService(
    @Autowired
    val paymentRepository: PaymentRepository,
) {
    fun findPaymentByAccount(account: String): PaymentResponse = paymentRepository.findPaymentByAccount(account).toInfoKeyResponse()
}
