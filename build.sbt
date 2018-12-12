name := "pf"

version := "0.0.1"

organization := "org.ruivieira"

scalaVersion := "2.11.12"

libraryDependencies += "org.scalanlp" %% "breeze" % "0.13"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

enablePlugins(GhpagesPlugin)

enablePlugins(SiteScaladocPlugin)

git.remoteRepo := "git@github.com:ruivieira/scala-pf.git"

licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0"))

mainClass in assembly := Some("org.ruivieira.pf.Main")
