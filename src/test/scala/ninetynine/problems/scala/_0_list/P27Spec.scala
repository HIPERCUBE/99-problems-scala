package ninetynine.problems.scala._0_list

import org.scalatest.{FlatSpec, Matchers}

class P27Spec extends FlatSpec with Matchers {
  val p27as: List[P27a[Int]] = List(
    new P27aImpl[Int],
    new P27aForImpl[Int],
  )
  val p27bs: List[P27b[Int]] = List(
    new P27bImpl[Int],
  )

  "P27a" should "group 9 items into 3 groups of size 2, 3, and 4" in {
    p27as.foreach(p27a => {
      val possibilities = p27a.group3(1 to 9 toList)
      possibilities should have length 1260
    })
  }

  "P27b" should "group 9 items into 3 groups of size 2, 3, and 4" in {
    p27bs.foreach(p27b => {
      val possibilities = p27b.group(List(2, 3, 4), 1 to 9 toList)
      possibilities should have length 1260
    })
  }
}
