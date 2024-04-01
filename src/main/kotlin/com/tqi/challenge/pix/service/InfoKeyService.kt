package com.tqi.challenge.pix.service

import com.tqi.challenge.pix.integretion.response.toInfoKeyResponse
import com.tqi.challenge.pix.repository.InfoKeyRepository
import com.tqi.challenge.pix.web.response.InfoKeyResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InfoKeyService(
    @Autowired
    val infoKeyRepository: InfoKeyRepository,
) {
    fun findInfoKeyById(id: Int): InfoKeyResponse = infoKeyRepository.findInfoKeyById(id).toInfoKeyResponse()
}
