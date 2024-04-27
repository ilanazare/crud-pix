package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.exception.CustomerNotFoundException
import com.tqi.challenge.pix.exception.ListAccountNotFound
import com.tqi.challenge.pix.repository.AccountRepository
import com.tqi.challenge.pix.repository.CustomerRepository
import com.tqi.challenge.pix.web.response.toAccountResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService(
    @Autowired
    val accountRepository: AccountRepository,
    @Autowired
    val customerRepository: CustomerRepository,
) {
    fun findListAccountByCustomer(customer: String) =
        accountRepository.findListAccountByCustomer(customer)
            .takeIf { it.isNotEmpty() } ?: throw ListAccountNotFound("Account not found for customer, $customer")

    fun update(request: Accounts) =
        try {
            val customer = customerRepository.findCustomerByCustomer(request.customer).customer
            accountRepository.save(request).toAccountResponse()
                .takeIf {
                    customer == request.customer
                }
        } catch (e: Exception) {
            throw CustomerNotFoundException("Error condition for customer update")
        }
}
