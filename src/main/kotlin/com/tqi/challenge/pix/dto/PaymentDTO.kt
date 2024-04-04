package com.tqi.challenge.pix.dto

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
data class PaymentDTO(
    val id: Int,
    val customer: String,
    val account: String,
    val pixType: String?,
    val pixKey: String?,
)
