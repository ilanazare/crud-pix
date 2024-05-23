package com.tqi.challenge.pix.domain.entity

import com.tqi.challenge.pix.domain.enum.PaymentTypeEnum
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.data.relational.core.mapping.Table

@Entity
@Table(name = "user")
data class User(
    @Id
    @Column(name = "customer", unique = true)
    var customer: String,
    val email: String,
    val password: PaymentTypeEnum,
    val role: String,
)
