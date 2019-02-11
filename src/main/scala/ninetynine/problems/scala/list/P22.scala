package ninetynine.problems.scala.list

import scala.annotation.tailrec

trait P22 {
  def range(start: Int, end: Int): List[Int]
}

class P22InbuiltImpl extends P22 {
  override def range(start: Int, end: Int): List[Int] = start to end toList
}

class P22RecursiveImpl extends P22 {
  override def range(start: Int, end: Int): List[Int] = {
    @tailrec
    def rangeR(list: List[Int], cur: Int): List[Int] = cur match {
      case i if cur >= start && cur <= end => rangeR(list :+ i, cur + 1)
      case _ if cur < start => rangeR(list, start)
      case _ if cur > end => list
    }

    rangeR(List(), 0)
  }
}
