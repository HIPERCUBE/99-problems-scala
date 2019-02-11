package ninetynine.problems.scala._0_list

import org.scalatest.{FlatSpec, Matchers}

class P09Spec extends FlatSpec with Matchers {
  val p09: P09[Int] = new P09Impl[Int]

  "A list without duplicates" should "returned with elements packed within one-element lists" in {
    p09.pack((0 to 3).toList) should equal(List(List(0), List(1), List(2), List(3)))
  }

  it should "pack consecutive duplicates" in {
    val duplicates = List(1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4)
    val packed = List(List(1, 1, 1), List(2, 2, 2, 2), List(3), List(4, 4, 4, 4))
    p09.pack(duplicates) should equal(packed)
  }
}
