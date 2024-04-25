package com.tqi.challenge.pix.web.controller

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class)
class CustomerControllerTest {
    lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var context: WebApplicationContext

    @BeforeEach
    fun setUp() {
        this.mockMvc =
            MockMvcBuilders.webAppContextSetup(this.context)
                .build()
    }

    @Test
    fun `getCustomer successfully`() {
        val customer = "2345434501000"

        mockMvc.perform(MockMvcRequestBuilders.get("/customer/$customer"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(jsonPath("$.name").value("daniela faguendes oliveira"))
            .andExpect(jsonPath("$.account[0].bank").value("BRADESCO"))
            .andExpect(jsonPath("$.account[0].payment[0].pixType").value("PHONE_NUMBER"))
    }
}
