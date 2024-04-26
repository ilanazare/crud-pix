package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.exception.CustomerNotFoundException
import com.tqi.challenge.pix.exception.ListAccountNotFound
import com.tqi.challenge.pix.repository.AccountRepository
import com.tqi.challenge.pix.web.response.toAccountResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService(
    @Autowired
    val accountRepository: AccountRepository,
) {
    fun findListAccountByCustomer(customer: String) =
        accountRepository.findListAccountByCustomer(customer)
            .takeIf { it.isNotEmpty() } ?: throw ListAccountNotFound("Account not found for customer")

    fun update(request: Accounts) {
        val customer =
            accountRepository.findAccountByCustomer(request.customer).stream()
                .filter { !request.customer.equals(null) }
        try {
            accountRepository.save(request).toAccountResponse()
                .takeIf { !customer.equals(null) }
        } catch (e: Exception) {
            throw CustomerNotFoundException("Customer not found to update account")
        }
    }
}
