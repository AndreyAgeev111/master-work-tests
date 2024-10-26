package com.example.demo.cases

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object CreateProduct {
  val createProduct: HttpRequestBuilder =
    http("POST _/api/v1/products")
      .post("/api/v1/products")
      .body(
        StringBody(
          s"""{
           |  "id": #{id},
           |  "name": "#{name}",
           |  "price": #{price},
           |  "isAvailable": true
           |}""".stripMargin
        )
      )
      .check(
        status is 200
      )
}
