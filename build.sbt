import Dependencies._

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.3"

ThisBuild / scalafixScalaBinaryVersion := "2.13"

lazy val commonSettings = Seq(
  scalafmtOnCompile := true,
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "riot4s",
    
    scalacOptions ++= Seq(
      "-Ywarn-unused"
    ),

    libraryDependencies ++= Seq(
      "io.circe"      %% "circe-core"          % CirceVersion,
      "io.circe"      %% "circe-generic"       % CirceVersion,
      "io.circe"      %% "circe-parser"        % CirceVersion,
      "org.typelevel" %% "cats-core"           % CatsVersion,
      "org.typelevel" %% "cats-effect"         % CatsEffectVersion,
      "org.http4s"    %% "http4s-blaze-client" % Http4sVersion,
      "org.http4s"    %% "http4s-circe"        % Http4sVersion,
      "org.http4s"    %% "http4s-dsl"          % Http4sVersion
    ),
    
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
  )