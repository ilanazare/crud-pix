package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.domain.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String>
