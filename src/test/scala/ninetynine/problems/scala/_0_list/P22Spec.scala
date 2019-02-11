package ninetynine.problems.scala._0_list

import org.scalatest.{FlatSpec, Matchers}

class P22Spec extends FlatSpec with Matchers {
  val p22s: List[P22] = List(
    new P22InbuiltImpl,
    new P22RecursiveImpl,
  )

  it should "create a list containing all integers within 1 to 10 range" in {
    p22s.foreach(p22 => {
      p22.range(1, 10) should equal(1 to 10 toList)
    })
  }

  it should "create empty list from 10 to 0 range" in {
    p22s.foreach(p22 => {
      p22.range(10, 0) should equal(List())
    })
  }

  it should "create a single element list from  1 to 1 range" in {
    p22s.foreach(p22 => {
      p22.range(1, 1) should equal(List(1))
    })
  }
}
