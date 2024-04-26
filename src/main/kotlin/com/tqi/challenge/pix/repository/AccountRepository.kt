package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.domain.entity.Accounts
import org.springframework.data.repository.CrudRepository
import java.util.Optional

interface AccountRepository : CrudRepository<Accounts, String> {
    fun findListAccountByCustomer(customer: String): List<Accounts> = findListAccountByCustomer(customer)

    fun findAccountByCustomer(customer: String): Optional<Accounts> = findAccountByCustomer(customer)
//
//    fun save(
//        request: Accounts,
//        customer: String,
//    ): AccountsResponse = save(request, customer)
}
