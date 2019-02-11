package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P11Spec extends FlatSpec with Matchers {
  val p11: P11[Char] = new P11Impl[Char]

  "A list with non-duplicated elements" should "returned untouched" in {
    p11.encodeModified(List('a', 'b', 'c')) should equal(List('a', 'b', 'c'))
  }

  "A list with duplicated elements" should "returned with encoded elements" in {
    val list = List('a', 'a', 'b', 'c', 'c', 'c')
    val expected = List((2, 'a'), 'b', (3, 'c'))
    p11.encodeModified(list) should equal(expected)
  }
}
