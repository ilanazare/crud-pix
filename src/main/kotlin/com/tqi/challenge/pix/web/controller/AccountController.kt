package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.domain.entity.Accounts
import com.tqi.challenge.pix.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController(
    private val accountService: AccountService,
) {
    @GetMapping("/{customer}")
    fun findAccountByCustomer(
        @PathVariable customer: String,
    ) = accountService.findListAccountByCustomer(customer)

//    @PostMapping
//    fun create(
//        @RequestBody request: Accounts,
//    ) = accountService.create(request)

    @PutMapping
    fun update(
        @RequestBody request: Accounts,
    ) = accountService.update(request)
}
