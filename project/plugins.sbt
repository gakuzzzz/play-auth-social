// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.0-M3")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")
