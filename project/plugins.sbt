unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions"
)

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")
