package ninetynine.problems.scala

import org.scalatest.{FunSuite, Matchers}

class P07Spec extends FunSuite with Matchers {
  val p07: P07 = new P07Impl

  test("that already flattened list is returned untouched") {
    p07.flatten((0 to 100).toList) should be((0 to 100).toList)
  }

  test("that nested list is flattened") {
    p07.flatten(List(0, 1, 2, List(3, 4, List(5, 6)), List(7, List(8)), 9, 10)) should be((0 to 10).toList)
  }
}
