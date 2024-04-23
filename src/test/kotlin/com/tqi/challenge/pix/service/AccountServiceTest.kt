package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.domain.entity.Payment
import com.tqi.challenge.pix.repository.AccountRepository
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
    @InjectMockKs
    private val accountService: AccountService,
) {
    @Test
    fun `account successfully test`() {
        val customer = "23454345090"

        every {
            accountRepository.findListAccountByCustomer(customer)
        } returns buildAccount()

        val response = accountService.findListAccountByCustomer(customer)
        assertEquals(response.get(0).account, "5676543-0")
        assertEquals(response.get(0).bank, "Banco do brazil")
        response.get(0).payment?.get(0)?.let { assertEquals(it.pixKey, "77872339533") }
        verify { accountRepository.findListAccountByCustomer(customer) }
    }

    private fun buildAccount(): List<Accounts> =
        listOf(
            Accounts(
                customer = "23454345090",
                bank = "Banco do brazil",
                agency = "23456-8",
                account = "5676543-0",
                payment = listOf(buildPayment()),
            ),
        )

    private fun buildPayment() =
        Payment(
            customer = "23454345090",
            account = "23456-8",
            pixType = "CPF",
            pixKey = "77872339533",
        )
}
