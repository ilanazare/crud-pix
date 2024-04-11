package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.entity.Payment
import org.springframework.data.repository.CrudRepository

interface PaymentRepository : CrudRepository<Payment, String> {
    fun findListPaymentByCustomer(customer: String): List<Payment> = findListPaymentByCustomer(customer)

    fun findPaymentByCustomer(customer: String): Payment = findPaymentByCustomer(customer)

    fun save(entity: Payment)
}
