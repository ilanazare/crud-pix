package com.tqi.challenge.pix.web.controller

import com.tqi.challenge.pix.mock.stubRetrieveCustomerSuccess
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWireMock(
    port = 0,
    stubs = ["classpath:/stubs"],
)
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
        stubRetrieveCustomerSuccess(customer)
        mockMvc.perform(MockMvcRequestBuilders.get("/customer/$customer"))
            .andExpect(MockMvcResultMatchers.status().isOk)
    }
}
