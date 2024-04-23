package com.tqi.challenge.pix.mock

import com.github.tomakehurst.wiremock.client.WireMock
import com.github.tomakehurst.wiremock.stubbing.StubMapping
import org.springframework.http.HttpStatus

fun stubRetrieveCustomerSuccess(customer: String): StubMapping =
    WireMock.stubFor(
        WireMock.get("/account/$customer")
            .willReturn(
                WireMock.aResponse()
                    .withStatus(HttpStatus.OK.value())
                    .withBody(
                        """
                        {
                        "customer": $customer,
                        "name": "iva luis",
                        "cpf": "77872339587",
                        "email": "iva@hotmail",
                        "phone": "71984376654",
                        "account": [
                        {
                        "customer": $customer,
                        "bank": "BANCO_DO_BRAZIL",
                        "agency": "3454-4",
                        "account": "8987769-0",
                        "payment": [
                        {
                        "customer": $customer,
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
