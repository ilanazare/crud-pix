package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.integretion.response.toAccountResponse
import com.tqi.challenge.pix.repository.AccountRepository
import com.tqi.challenge.pix.web.response.AccountsResponse
import org.springframework.stereotype.Service

@Service
class AccountService(
    val accountRepository: AccountRepository,
) {
    fun findAccountByCustomer(customer: String): AccountsResponse = accountRepository.findAccountByCustomer(customer).toAccountResponse()!!
}
