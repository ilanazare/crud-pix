package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.entity.Accounts
import org.springframework.data.repository.CrudRepository
import java.util.Optional

interface AccountRepository : CrudRepository<Accounts, String> {
    fun findListAccountByCustomer(customer: String): List<Accounts> = findListAccountByCustomer(customer)

    fun findAccountByAccount(account: String): Optional<Accounts> = findAccountByAccount(account)
}
