package com.tqi.challenge.pix.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor
import org.springframework.data.relational.core.mapping.Table

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "payment")
data class Payment(
    @Id
    @Column(name = "customer", unique = true)
    var customer: String,
    val account: String,
    val pixType: String,
    val pixKey: String,
)
