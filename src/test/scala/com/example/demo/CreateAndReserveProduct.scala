package com.example.demo

import com.example.demo.scenarios.CreateAndReserveProductScenario
import io.gatling.core.Predef._
import ru.tinkoff.gatling.config.SimulationConfig._
import ru.tinkoff.gatling.influxdb.Annotations

class CreateAndReserveProduct extends Simulation with Annotations {

  setUp(
    CreateAndReserveProductScenario.scn.inject(
      rampUsersPerSec(0) to intensity.toInt during rampDuration,
      constantUsersPerSec(intensity.toInt) during stageDuration
    )
  )
    .protocols(httpProtocol)
    .maxDuration(testDuration)
}
