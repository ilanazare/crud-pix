package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.entity.InfoKey
import org.springframework.data.repository.CrudRepository

interface InfoKeyRepository : CrudRepository<InfoKey, Int> {
    fun findInfoKeyById(id: Int): InfoKey = findInfoKeyById(id)
}
