package ninetynine.problems.scala

import org.scalatest.{FlatSpec, Matchers}

class P18Spec extends FlatSpec with Matchers {
  val p18s: List[P18[Int]] = List(
    new P18Impl[Int],
    new P18TakeDropImpl[Int],
    new P18RecursiveImpl[Int],
  )

  it should "slice a list" in {
    p18s.foreach(p18 => {
      p18.slice(2, 4, (1 to 10).toList) should equal((3 to 4).toList)
    })
  }

  it should "not slice a list" in {
    p18s.foreach(p18 => {
      p18.slice(12, 15, (1 to 10).toList) should equal(List[Int]())
    })
  }
}
