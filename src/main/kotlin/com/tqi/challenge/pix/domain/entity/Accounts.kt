package com.tqi.challenge.pix.domain.entity

import com.tqi.challenge.pix.domain.enum.BankAccountEnum
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import org.springframework.data.relational.core.mapping.Table

@Entity
@Table(name = "accounts")
data class Accounts(
    @Id
    @Column(name = "customer", unique = true)
    val customer: String,
    @Enumerated(EnumType.STRING)
    val bank: BankAccountEnum,
    val agency: String,
    var account: String,
    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer")
    val payment: List<Payment>?,
)
