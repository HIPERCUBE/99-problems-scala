package ninetynine.problems.scala.list

import scala.annotation.tailrec

trait P03[T] {
  def nth(n: Int, list: List[T]): Option[T]
}

class P03Impl[T] extends P03[T] {
  @tailrec
  final override def nth(n: Int, list: List[T]): Option[T] = (n, list) match {
    case (_, Nil) => None
    case (x, _) if x < 0 || x >= list.size => None
    case (0, head :: _) => Some(head)
    case (x, _ :: tail) => nth(x - 1, tail)
  }
}
