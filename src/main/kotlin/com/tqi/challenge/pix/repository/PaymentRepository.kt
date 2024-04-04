package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.entity.Payment
import org.springframework.data.repository.CrudRepository

interface PaymentRepository : CrudRepository<Payment, String>
{
    fun findPaymentByCustomer(customer: String): List<Payment> = findPaymentByCustomer(customer)
}
