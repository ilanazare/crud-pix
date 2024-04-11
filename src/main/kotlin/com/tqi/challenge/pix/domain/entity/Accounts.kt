package com.tqi.challenge.pix.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor
import org.springframework.data.relational.core.mapping.Table

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "accounts")
data class Accounts(
    @Id
    @Column(name = "customer", unique = true)
    val customer: String,
    val bank: String,
    val agency: String,
    var account: String,
    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer")
    val payment: List<Payment>?,
)
