package com.tqi.challenge.pix.domain.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor
import org.springframework.data.relational.core.mapping.Table

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "customers")
data class Customers(
    @Id
    @Column(name = "customer", unique = true)
    var customer: String,
    val name: String,
    val cpf: String,
    val email: String,
    val phone: String,
    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "customer")
    val account: List<Accounts>,
)
