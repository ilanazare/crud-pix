package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.service.InfoKeyService
import com.tqi.challenge.pix.web.response.InfoKeyResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class InfoKeyController(
    private val infoKeyService: InfoKeyService,
) {
    @GetMapping("/infoKey/{id}")
    fun findInfoKeyById(
        @PathVariable id: Int,
    ): InfoKeyResponse = infoKeyService.findInfoKeyById(id)
}
