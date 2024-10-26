import DependenciesVersion.*
import sbt.*

object Dependencies {
  private lazy val gatling: Seq[ModuleID] = Seq(
    "io.gatling.highcharts" % "gatling-charts-highcharts",
    "io.gatling" % "gatling-test-framework"
  ).map(_ % gatlingVersion % Test)

  private lazy val gatlingPicatinny: Seq[ModuleID] = Seq(
    "ru.tinkoff" %% "gatling-picatinny"
  ).map(_ % gatlingPicatinnyVersion)

  private lazy val janino: Seq[ModuleID] = Seq(
    "org.codehaus.janino" % "janino"
  ).map(_ % janinoVersion)

  lazy val gatlingDependencies: Seq[ModuleID] = gatling ++ gatlingPicatinny ++ janino
}
