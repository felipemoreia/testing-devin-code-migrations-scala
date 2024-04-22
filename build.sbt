import Dependencies._

ThisBuild / scalaVersion     := "2.12.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

resolvers += "Maven Central" at "https://repo1.maven.org/maven2"

lazy val commonClasses = (project in file("platform/common-classes"))
  .settings(
    name := "Common Classes",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "org.apache.spark" %% "spark-core" % "3.5.1" % Provided,
      "org.apache.spark" %% "spark-sql" % "3.5.1" % Provided
    )
  )

lazy val domainA = (project in file("subdomains/domain-A"))
  .settings(
    name := "Domain A",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "org.apache.spark" %% "spark-core" % "3.5.1" % Provided,
      "org.apache.spark" %% "spark-sql" % "3.5.1" % Provided
    )
  )
  .dependsOn(commonClasses)

lazy val subdomain1to4 = (project in file("subdomains/1to4"))
  .settings(
    name := "Subdomain 1to4",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "org.apache.spark" %% "spark-core" % "3.5.1" % Provided,
      "org.apache.spark" %% "spark-sql" % "3.5.1" % Provided
    ),
    scalaSource in Compile := baseDirectory.value / "src" / "main" / "scala",
    scalaSource in Test := baseDirectory.value / "src" / "test" / "scala",
    Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat
  )
  .dependsOn(commonClasses)

lazy val root = (project in file("."))
  .aggregate(commonClasses, domainA, subdomain1to4)
  .dependsOn(commonClasses, subdomain1to4)
  .settings(
    name := "Testing Devin Code Migrations Scala",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "org.apache.spark" %% "spark-core" % "3.5.1" % Provided,
      "org.apache.spark" %% "spark-sql" % "3.5.1" % Provided,
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),
    scalaSource in Test := baseDirectory.value / "src" / "test" / "scala"
  )
