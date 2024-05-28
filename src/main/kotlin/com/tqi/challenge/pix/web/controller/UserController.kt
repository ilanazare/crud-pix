package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.service.UserService
import com.tqi.challenge.pix.web.request.UserRequest
import com.tqi.challenge.pix.web.request.toUser
import com.tqi.challenge.pix.web.response.UserResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService,
) {
    @PostMapping
    fun create(
        @RequestBody request: UserRequest,
    ): UserResponse? {
        return userService.create(request.toUser())
    }
}
