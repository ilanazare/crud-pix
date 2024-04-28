package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.domain.entity.Accounts
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Accounts, String> {
    fun findListAccountByCustomer(customer: String): List<Accounts> = findListAccountByCustomer(customer)
}
