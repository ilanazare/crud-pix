package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.entity.Accounts
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Accounts, Int> {
    fun findAccountById(id: Int): Accounts = findAccountById(id)
}
