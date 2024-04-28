package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.domain.entity.Payment
import org.springframework.data.repository.CrudRepository

interface PaymentRepository : CrudRepository<Payment, String> {
    fun findListPaymentByCustomer(customer: String): List<Payment> = findListPaymentByCustomer(customer)
}
