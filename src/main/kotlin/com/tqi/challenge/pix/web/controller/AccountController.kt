package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.service.AccountService
import com.tqi.challenge.pix.web.response.AccountsResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController(
    private val accountService: AccountService,
) {
    @GetMapping("/account/{customer}")
    fun findAccountByCustomer(
        @PathVariable customer: String,
    ): AccountsResponse = accountService.findAccountByCustomer(customer)
}
