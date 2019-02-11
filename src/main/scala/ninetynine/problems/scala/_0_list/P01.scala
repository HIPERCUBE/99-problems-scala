package ninetynine.problems.scala._0_list

trait P01[T] {
  def last(list: List[T]): Option[T]
}

class P01Impl[T] extends P01[T] {
  override def last(list: List[T]): Option[T] = list match {
    case Nil => None
    case head :: Nil => Some(head)
    case _ :: tail => last(tail)
  }
}
