package com.example.demo.cases

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object ReserveProduct {
  val reserveProduct: HttpRequestBuilder =
    http("POST _/api/v1/products/{id}/reserve")
      .post("/api/v1/products/#{id}/reserve")
      .check(
        status is 200
      )
}
