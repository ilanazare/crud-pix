package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.repository.AccountRepository
import com.tqi.challenge.pix.web.request.RetrieveAccountRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService(
    @Autowired
    val accountRepository: AccountRepository,
) {
    fun findListAccountByCustomer(customer: String) = accountRepository.findListAccountByCustomer(customer)

    fun create(request: Accounts): RetrieveAccountRequest {
        if (!accountRepository.findAccountByAccount(request.customer).isPresent) {
            accountRepository.save(request)
        }
        throw Exception()
    }
}
