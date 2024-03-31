package com.tqi.challenge.pix.dto

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
data class CustomersDTO(
    val id: Int,
    val customer: String,
    val name: String,
    val cpf: String,
    val email: String?,
    val phone: String?,
    val account: List<AccountsDTO>,
)
