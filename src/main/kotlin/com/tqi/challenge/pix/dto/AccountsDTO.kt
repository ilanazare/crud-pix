package com.tqi.challenge.pix.dto

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
data class AccountsDTO(
    val id: Int,
    val customer: String,
    val bank: String,
    val agency: String,
    val account: String,
    val infoKey: List<PaymentDTO>,
)
