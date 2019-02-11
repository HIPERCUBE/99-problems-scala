package ninetynine.problems.scala._0_list

import org.scalatest.{FlatSpec, Matchers}

class P21Spec extends FlatSpec with Matchers {
  val p21s: List[P21[Int]] = List(
    new P21Impl[Int],
    new P21InbuiltImpl[Int],
    new P21RecursiveImpl[Int],
  )


  it should "insert element at the front of the list" in {
    p21s.foreach(p21 => {
      p21.insertAt(100, 3, List(1, 2, 3)) should equal(List(1, 2, 3, 100))
    })
  }

  it should "insert element at the middle of the list" in {
    p21s.foreach(p21 => {
      p21.insertAt(100, 2, List(1, 2, 3)) should equal(List(1, 2, 100, 3))
    })
  }

  it should "insert element at the end of the list" in {
    p21s.foreach(p21 => {
      p21.insertAt(100, 0, List(1, 2, 3)) should equal(List(100, 1, 2, 3))
    })
  }
}
