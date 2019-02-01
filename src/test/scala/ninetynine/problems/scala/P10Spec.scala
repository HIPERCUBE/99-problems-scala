package ninetynine.problems.scala

import org.scalatest.{FlatSpec, FunSuite, Matchers}

class P10Spec extends FunSuite with Matchers {
  val p10: P10[Char] = new P10Impl[Char]

  test("List with non-duplicated elements") {
    val nonDuplicatedElements = List('a', 'b', 'c')
    val expected = for (e <- nonDuplicatedElements) yield (1, e)
    p10.encode(nonDuplicatedElements) should equal(expected)
  }

  test("List with duplicated elements") {
    val duplicatedElements = List('a', 'a', 'b', 'c', 'c', 'c')
    val expected = List((2, 'a'), (1, 'b'), (3, 'c'))
    p10.encode(duplicatedElements) should equal(expected)
  }
}
