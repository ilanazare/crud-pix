package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Customers
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.repository.CustomerRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
class CustomerServiceTest(
    @MockK
    private val customerRepository: CustomerRepository,
    @InjectMockKs
    private val customerService: CustomerService,
) {
    @Test
    fun `customer successfully test`() {
        val customer = "23454345090"

        every {
            customerRepository.findCustomerByCustomer(customer)
        } returns buildCustomer()

        val response = customerService.findCustomerByCustomer(customer)
        assertEquals(response.customer, "23454345090")
        assertEquals(response.account[0].account, "5676543-0")
        response.account[0].payment?.get(0)?.let { assertEquals(it.pixKey, "77872339533") }
        verify { customerRepository.findCustomerByCustomer(customer) }
    }

    private fun buildCustomer() =
        Customers(
            customer = "23454345090",
            name = "iva luis",
            cpf = "77872339587",
            email = "iva@hotmail",
            phone = "71984376654",
            account = listOf(buildAccount()),
        )

    private fun buildAccount() =
        Accounts(
            customer = "23454345090",
            bank = enumValueOf("BANK_OF_BRAZIL"),
            agency = "23456-8",
            account = "5676543-0",
            payment = listOf(buildPayment()),
        )

    private fun buildPayment() =
        Payment(
            customer = "23454345090",
            account = "23456-8",
            pixType = enumValueOf("CPF"),
            pixKey = "77872339533",
        )
}
