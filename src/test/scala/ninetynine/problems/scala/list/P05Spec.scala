package ninetynine.problems.scala.list

import org.scalatest.{FunSuite, Matchers}

class P05Spec extends FunSuite with Matchers {
  val p05: P05[Int] = new P05Impl[Int]

  test("that empty list should be reversed to list") {
    p05.reverse(List()) should be(List())
  }

  test("that one-element list should be reversed to itself") {
    p05.reverse(List(4)) should be(List(4))
  }

  test("that two-element list should exchange two elements when reversed") {
    p05.reverse(List(3, 4)) should be(List(4, 3))
  }

  test("that list should be reversed") {
    p05.reverse((0 to 100).toList) should be((100 to 0 by -1).toList)
  }
}
