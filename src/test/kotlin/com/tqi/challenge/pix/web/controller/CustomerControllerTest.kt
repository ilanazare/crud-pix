package com.tqi.challenge.pix.web.controller

// import com.tqi.challenge.pix.mock.stubRetrieveCustomerSuccess
// import org.junit.jupiter.api.BeforeEach
// import org.junit.jupiter.api.Test
// import org.junit.jupiter.api.extension.ExtendWith
// import org.springframework.boot.test.context.SpringBootTest
// import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock
// import org.springframework.test.context.junit.jupiter.SpringExtension
// import org.springframework.test.web.servlet.MockMvc
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
// import org.springframework.test.web.servlet.setup.MockMvcBuilders
//
// @ExtendWith(SpringExtension::class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @AutoConfigureWireMock(
//    port = 0,
//    stubs = ["classpath:/stubs"],
// )
// class AccountControllerTest {
//    lateinit var mockMvc: MockMvc
//
//    @BeforeEach
//    fun setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup().build()
//    }
//
//    @Test
//    fun `getCustomer successfully`() {
//        val customer = "23109878"
//        stubRetrieveCustomerSuccess(customer)
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/customer/$customer"))
//        //            .andExpect(MockMvcResultMatchers.status().isOk)
//    }
// }
