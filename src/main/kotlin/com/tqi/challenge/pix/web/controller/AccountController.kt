package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.service.AccountService
import com.tqi.challenge.pix.web.response.AccountsResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController(
    private val service: AccountService,
) {
    @GetMapping("/account/{id}")
    fun findAccountById(
        @PathVariable id: Int,
    ): AccountsResponse = service.findAccountById(id)
}
