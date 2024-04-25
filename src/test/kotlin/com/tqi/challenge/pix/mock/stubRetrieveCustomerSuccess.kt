package com.tqi.challenge.pix.mock

import com.github.tomakehurst.wiremock.client.WireMock
import com.github.tomakehurst.wiremock.stubbing.StubMapping
import org.springframework.http.HttpStatus

fun stubRetrieveCustomerSuccess(customer: String): StubMapping =
    WireMock.stubFor(
        WireMock.get("/customer/2345434501000")
            .willReturn(
                WireMock.aResponse()
                    .withStatus(HttpStatus.OK.value())
                    .withBody(
                        """
                        {
                        "customer": "2345434501000",
                        "name": "iva luis",
                        "cpf": "77872339587",
                        "email": "iva@hotmail",
                        "phone": "71984376654",
                        "account": [
                        {
                        "customer": "2345434501000",
                        "bank": "BANCO_DO_BRAZIL",
                        "agency": "3454-4",
                        "account": "8987769-0",
                        "payment": [
                        {
                        "customer": "2345434501000",
                        "account": "8987769-0",
                        "pixType": "PHONE",
                        "pixKey": "71965654334"
                        }
                        ]
                        }
                        ]
                        }
                        """.trimIndent(),
                    ),
            ),
    )
