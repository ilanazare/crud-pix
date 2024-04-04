package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.entity.Payment
import org.springframework.data.repository.CrudRepository

interface PaymentRepository : CrudRepository<Payment, String>
{
    fun findPaymentByAccount(account: String): Payment = findPaymentByAccount(account)
}
