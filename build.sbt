lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.ruivieira",
      scalaVersion := "2.11.12",
      resolvers ++= Seq(
        "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
        "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/",
        "Artima Maven Repository" at "http://repo.artima.com/releases"
      ),
      libraryDependencies := Seq(
        "org.scalactic" %% "scalactic" % "3.0.5",
        "org.scalatest" %% "scalatest" % "3.0.5" % "test",
        "org.scalanlp" %% "breeze" % "0.13.2",
        "org.scalanlp" %% "breeze-natives" % "0.13.2"
      )
    )),
    name := "pf",
    version := "0.0.1",
    mainClass in assembly := Some("Main")
  )
