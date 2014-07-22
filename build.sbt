import com.banno._

name := "daisydiff"

organization := "org.outerj.daisy.diff"

version in ThisBuild := "1.3.banno-2"

publishTo := Some("Banno Releases Repo" at "http://nexus.banno.com/nexus/content/repositories/releases")

credentials += Credentials(Path.userHome / ".ivy2" / ".banno_credentials")

libraryDependencies ++= Seq(
  "net.sourceforge.nekohtml" % "nekohtml" % "1.9.11",
  "org.eclipse.core.runtime" % "compatibility" % "3.1.200-v20070502",
  "xerces" % "xercesImpl" % "2.9.1",
  "junit" % "junit" % "4.10" % "test",
  "com.novocode" % "junit-interface" % "0.9" % "test"
)
