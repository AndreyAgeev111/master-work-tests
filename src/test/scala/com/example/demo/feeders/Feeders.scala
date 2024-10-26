package com.example.demo.feeders

import io.gatling.core.feeder.Feeder
import ru.tinkoff.gatling.feeders.{RandomDigitFeeder, RandomStringFeeder}

object Feeders {
  val id: Feeder[Int] = Iterator.from(0).map(i => Map("id" -> i))
  val name: Feeder[String] = RandomStringFeeder("name")
  val price: Feeder[Int] = RandomDigitFeeder("price")
}
