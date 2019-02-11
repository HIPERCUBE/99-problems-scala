package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P15Spec extends FlatSpec with Matchers {
  val p15: P15[Char] = new P15Impl[Char]

  "DuplicateN" should "work correctly" in {
    val list = List('a', 'b', 'b', 'c')
    val expected2 = List('a', 'a', 'b', 'b', 'b', 'b', 'c', 'c')
    val expected3 = List('a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c', 'c')
    p15.duplicateN(2, list) should equal(expected2)
    p15.duplicateN(3, list) should equal(expected3)
  }

  "DuplicateNR" should "work correctly" in {
    val list = List('a', 'b', 'b', 'c')
    val expected2 = List('a', 'a', 'b', 'b', 'b', 'b', 'c', 'c')
    val expected3 = List('a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c', 'c')
    p15.duplicateNR(2, list) should equal(expected2)
    p15.duplicateNR(3, list) should equal(expected3)
  }
}
