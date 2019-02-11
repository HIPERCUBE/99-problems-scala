package ninetynine.problems.scala.list

import org.scalatest.{FlatSpec, Matchers}

class P23Spec extends FlatSpec with Matchers {
  val p23s: List[P23[Int]] = List(
    new P23Impl[Int],
    new P23RecursiveImpl[Int],
  )

  it should "extract a given number of randomly selected elements from a list" in {
    p23s.foreach(p23 => {
      val selected = p23.randomSelect(10, 1 to 100 toList)
      selected should have length 10
      selected.foreach(s => {
        s should be >= 1
        s should be <= 100
      })
    })
  }
}
