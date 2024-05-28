package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.domain.entity.User
import com.tqi.challenge.pix.repository.UserRepository
import com.tqi.challenge.pix.web.response.UserResponse
import com.tqi.challenge.pix.web.response.toUserResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(
    @Autowired
    val userRepository: UserRepository,
) {
    fun create(request: User): UserResponse = userRepository.save(request).toUserResponse()
}
