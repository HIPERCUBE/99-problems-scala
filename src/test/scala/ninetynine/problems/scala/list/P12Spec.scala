package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P12Spec extends FlatSpec with Matchers {
  val p12: P12[Char] = new P12Impl[Char]

  "Run-length encoded list" should "decoded correctly" in {
    val encoded = List((2, 'a'), (1, 'b'), (3, 'c'))
    val decoded = List('a', 'a', 'b', 'c', 'c', 'c')
    p12.decode(encoded) should equal(decoded)
  }
}
