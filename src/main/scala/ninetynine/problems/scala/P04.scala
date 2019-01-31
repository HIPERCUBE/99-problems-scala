package ninetynine.problems.scala

import scala.annotation.tailrec

trait P04[T] {
  def length(list: List[T]): Int
}

class P04Impl[T] extends P04[T] {
  final override def length(list: List[T]): Int = {
    @tailrec
    def _len(acc: Int, lt: List[T]): Int = lt match {
      case Nil => acc
      case _ :: tail => _len(acc + 1, tail)
    }

    _len(0, list)
  }
}
