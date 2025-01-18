package com.example.demo.cases

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object GetProduct {
  val getProduct: HttpRequestBuilder =
    http("GET _/api/v1/products/{id}")
    .get("/api/v1/products/#{id}")
    .check(
      status is 200
    )
}
