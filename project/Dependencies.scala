import sbt._

object Dependencies {

  val prometheus    = "io.prometheus"        % "simpleclient" % "0.8.0"
  val scalatest     = "org.scalatest"       %% "scalatest"    % "3.1.0"
  val `cats-helper` = "com.evolutiongaming" %% "cats-helper"  % "1.5.2"

  object Cats {
    private val version = "2.0.0"
    val core   = "org.typelevel" %% "cats-core"   % version
    val effect = "org.typelevel" %% "cats-effect" % version
  }
}
