package com.tqi.challenge.pix.domain.entity

import com.tqi.challenge.pix.domain.enum.PaymentTypeEnum
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import org.springframework.data.relational.core.mapping.Table

@Entity
@Table(name = "payment")
data class Payment(
    @Id
    @Column(name = "customer", unique = true)
    var customer: String,
    val account: String,
    @Enumerated(EnumType.STRING)
    val pixType: PaymentTypeEnum,
    val pixKey: String,
)
