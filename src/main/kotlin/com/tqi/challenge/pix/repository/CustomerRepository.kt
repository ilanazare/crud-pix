package com.tqi.challenge.pix.repository

import com.tqi.challenge.pix.domain.entity.Customers
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customers, String> {
    fun findCustomerByCustomer(customer: String): Customers = findCustomerByCustomer(customer)
}
