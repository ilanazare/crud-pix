package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Customers
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.request.CustomerRequest
import com.tqi.challenge.pix.web.request.toCustomerRequest
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
        response.account?.get(0)?.let { assertEquals(it.account, "5676543-0") }
        response.account?.get(0)?.payment?.get(0)?.let { assertEquals(it.pixKey, "77872339533") }
        verify { customerRepository.findCustomerByCustomer(customer) }
    }

    @Test
    fun `tests customer post successfully `() {
        val request = buildCustomer()

        every {
            customerRepository.save(request)
        } returns buildCustomer()

        val customerSaved = customerService.create(request)

        assertEquals(request.customer, customerSaved.customer)
        request.account?.get(0)?.let { assertEquals(it.account, "5676543-0") }
        request.account?.get(0)?.payment?.get(0)?.let { assertEquals(it.pixKey, "77872339533") }
        verify { customerRepository.save(request) }
    }

    @Test
    fun `tests customer update successfully `() {
        val customer = "23454345090"
        val request = buildUpdateCustomerRequest()

        every {
            customerRepository.findCustomerByCustomer(customer)
        } returns buildUpdateCustomerResponse()
        every {
            customerRepository.save(request.toCustomerRequest())
        } returns buildUpdateCustomerResponse()

        customerService.update(request.toCustomerRequest())

        assertEquals(request.name, "iva luis nazareth")
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

    private fun buildUpdateCustomerRequest() =
        CustomerRequest(
            customer = "23454345090",
            name = "iva luis nazareth",
            cpf = "77872339587",
            email = "iva@hotmail",
            phone = "71984376654",
            account = listOf(buildUpdateAccountRequest()),
        )

    private fun buildUpdateAccountRequest() =
        Accounts(
            customer = "23454345090",
            bank = enumValueOf("PAG_BANK"),
            agency = "23456-8",
            account = "5676543-0",
            payment = listOf(buildUpdatePaymentRequest()),
        )

    private fun buildUpdatePaymentRequest() =
        Payment(
            customer = "23454345090",
            account = "23456-8",
            pixType = enumValueOf("PHONE_NUMBER"),
            pixKey = "77872339533",
        )

    private fun buildUpdateCustomerResponse() =
        Customers(
            customer = "23454345090",
            name = "iva luis nazareth",
            cpf = "77872339587",
            email = "iva@hotmail",
            phone = "71984376654",
            account = listOf(buildUpdateAccountResponse()),
        )

    private fun buildUpdateAccountResponse() =
        Accounts(
            customer = "23454345090",
            bank = enumValueOf("PAG_BANK"),
            agency = "23456-8",
            account = "5676543-0",
            payment = listOf(buildUpdatePaymentResponse()),
        )

    private fun buildUpdatePaymentResponse() =
        Payment(
            customer = "23454345090",
            account = "23456-8",
            pixType = enumValueOf("PHONE_NUMBER"),
            pixKey = "77872339533",
        )
}
