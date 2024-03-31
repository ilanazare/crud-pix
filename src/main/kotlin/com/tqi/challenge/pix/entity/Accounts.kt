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
    @Column(name = "id")
    val id: Int,
    val customer: String,
    val bank: String,
    val agency: String,
    val account: String,
    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id")
    val infoKey: List<InfoKey>,
)
