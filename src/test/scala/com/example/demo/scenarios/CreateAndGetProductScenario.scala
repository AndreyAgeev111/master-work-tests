package com.example.demo.scenarios

import com.example.demo.cases.{CreateProduct, GetProduct}
import com.example.demo.feeders.Feeders.{id, name, price}
import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder

object CreateAndGetProductScenario {
  val scn: ScenarioBuilder = scenario("Create And Get Product Scenario")
    .feed(id)
    .feed(name)
    .feed(price)
    .exec(CreateProduct.createProduct)
    .exec(GetProduct.getProduct)
}
