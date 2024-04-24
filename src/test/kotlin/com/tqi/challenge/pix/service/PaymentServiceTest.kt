package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.repository.PaymentRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
class PaymentServiceTest(
    @MockK
    private val paymentRepository: PaymentRepository,
    @InjectMockKs
    private val paymentService: PaymentService,
) {
    @Test
    fun `customer successfully test`() {
        val customer = "23454345090"

        every {
            paymentRepository.findListPaymentByCustomer(customer)
        } returns buildPayment()

        val response = paymentService.findListPaymentByCustomer(customer)

        assertEquals(response[0].customer, "23454345090")
        verify { paymentRepository.findListPaymentByCustomer(customer) }
    }

    private fun buildPayment() =
        listOf(
            Payment(
                customer = "23454345090",
                account = "23456-8",
                pixType = enumValueOf("CPF"),
                pixKey = "77872339533",
            ),
        )
}
