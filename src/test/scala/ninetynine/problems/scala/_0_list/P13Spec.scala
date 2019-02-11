package ninetynine.problems.scala._0_list

import org.scalatest.{FlatSpec, Matchers}

class P13Spec extends FlatSpec with Matchers {
  val p13: P13[Char] = new P13Impl[Char]

  "A list with duplicated elements" should "returned with encoded element" in {
    val list = List('a', 'a', 'b', 'c', 'c', 'c')
    val expected = List((2, 'a'), (1, 'b'), (3, 'c'))
    p13.encodeDirect(list) should equal(expected)
  }
}
