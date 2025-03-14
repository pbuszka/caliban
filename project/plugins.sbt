addSbtPlugin("org.scalameta"      % "sbt-scalafmt"             % "2.4.3")
addSbtPlugin("com.geirsson"       % "sbt-ci-release"           % "1.5.7")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "1.7.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                  % "0.4.3")
addSbtPlugin("com.thesamet"       % "sbt-protoc"               % "1.0.4")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.4"
