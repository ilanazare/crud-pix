package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Customers
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.repository.AccountRepository
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.request.AccountRequest
import com.tqi.challenge.pix.web.request.toAccountRequest
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
class AccountServiceTest(
    @MockK
    private val accountRepository: AccountRepository,
    @MockK
    private val customerRepository: CustomerRepository,
    @InjectMockKs
    private val accountService: AccountService,
) {
    @Test
    fun `account successfully test`() {
        val customer = "23454345090"

        every {
            accountRepository.findListAccountByCustomer(customer)
        } returns buildAccount()

        every {
            customerRepository.findCustomerByCustomer(customer)
        } returns buildCustomer()

        val response = accountService.findListAccountByCustomer(customer)
        assertEquals(response[0].account, "5676543-0")
        assertEquals(response[0].bank, enumValueOf("BANK_OF_BRAZIL"))
        response[0].payment?.get(0)?.let { assertEquals(it.pixKey, "77872339533") }
        verify { accountRepository.findListAccountByCustomer(customer) }
    }

    @Test
    fun `tests account update successfully `() {
        val customer = "23454345090"
        val request = buildUpdateAccountRequest()

        every {
            customerRepository.findCustomerByCustomer(customer)
        } returns buildUpdateCustomerResponse()
        every {
            accountRepository.save(request.toAccountRequest())
        } returns buildUpdateAccountResponse()

        val result = accountService.update(request.toAccountRequest())

        result?.let { assertEquals(it.bank, request.bank) }
        if (result != null) {
            result.payment?.get(0)?.let { request.payment?.get(0)?.let { it1 -> assertEquals(it.pixType, it1.pixType) } }
        }
        verify { customerRepository.findCustomerByCustomer(customer) }
        verify { accountRepository.save(request.toAccountRequest()) }
    }

    private fun buildCustomer() =
        Customers(
            customer = "23454345090",
            name = "iva luis",
            cpf = "77872339587",
            email = "iva@hotmail",
            phone = "71984376654",
            account = buildAccount(),
        )

    private fun buildAccount(): List<Accounts> =
        listOf(
            Accounts(
                customer = "23454345090",
                bank = enumValueOf("BANK_OF_BRAZIL"),
                agency = "23456-8",
                account = "5676543-0",
                payment = listOf(buildPayment()),
            ),
        )

    private fun buildPayment() =
        Payment(
            customer = "23454345090",
            account = "23456-8",
            pixType = enumValueOf("CPF"),
            pixKey = "77872339533",
        )

    private fun buildUpdateAccountRequest() =
        AccountRequest(
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
