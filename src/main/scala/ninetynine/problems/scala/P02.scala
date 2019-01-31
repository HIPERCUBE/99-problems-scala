package ninetynine.problems.scala

import scala.annotation.tailrec

trait P02[T] {
  def penultimate(list: List[T]): Option[T]
}

class P02Impl[T] extends P02[T] {
  @tailrec
  final override def penultimate(list: List[T]): Option[T] = list match {
    case Nil => None
    case _ :: Nil => None
    case penultimate :: _ :: Nil => Some(penultimate)
    case _ :: tail => penultimate(tail)
  }
}
