package com.example.demo.scenarios

import com.example.demo.cases.{CreateProduct, ReserveProduct}
import com.example.demo.feeders.Feeders._
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

object CreateAndReserveProductScenario {
  val scn: ScenarioBuilder = scenario("Create And Reserve Product Scenario")
    .feed(id)
    .feed(name)
    .feed(price)
    .exec(CreateProduct.createProduct)
    .exec(ReserveProduct.reserveProduct)
}
