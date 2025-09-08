import sbt._

object Libraries {
  object Versions {
    val CatsVersion = "2.12.0"
    val fs2Version = "3.12.2"
    val munitV = "1.0.1"
    val scalacheckEffectV = "1.0.4"
    val RefinedVersion = "0.11.2"
    val AttoCoreVersion = "0.9.5"
    val ShapelessVersion = "2.3.12"
  }

  import Versions._

  val AttoCore = "org.tpolecat" %% "atto-core" % AttoCoreVersion

  val fs2Core = "co.fs2" %% "fs2-core" % fs2Version
  val fs2IOTest = "co.fs2" %% "fs2-io" % fs2Version % Test

  val Refined = "eu.timepit" %% "refined" % RefinedVersion

  val Shapeless = "com.chuusai" %% "shapeless" % ShapelessVersion

  val CatsCore = "org.typelevel" %% "cats-core" % CatsVersion
  val CatsKernel = "org.typelevel" %% "cats-kernel" % CatsVersion
  val MUnitTest = "org.scalameta" %% "munit" % munitV % Test
  val ScalaCheckEffectMUnit =
    "org.typelevel" %% "scalacheck-effect-munit" % scalacheckEffectV % Test

}
