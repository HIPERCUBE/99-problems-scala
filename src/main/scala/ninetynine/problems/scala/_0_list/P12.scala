package ninetynine.problems.scala._0_list

import scala.annotation.tailrec

trait P12[T] {
  def decode(list: List[(Int, T)]): List[T]
}

class P12Impl[T] extends P12[T] {
  override def decode(list: List[(Int, T)]): List[T] = {
    @tailrec
    def decodeR(acc: List[T], encoded: List[(Int, T)]): List[T] = encoded match {
      case Nil => acc
      case e :: tail => decodeR(acc ++ List.fill(e._1)(e._2), tail)
    }

    decodeR(List(), list)
  }
}
