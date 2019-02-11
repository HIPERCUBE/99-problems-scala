package ninetynine.problems.scala.list

trait P05[T] {
  def reverse(list: List[T]): List[T]
}

class P05Impl[T] extends P05[T] {
  final override def reverse(list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: Nil => List(head)
    case e1 :: e2 :: tail => reverse(tail) ++ List(e2, e1)
  }
}
