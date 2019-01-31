package ninetynine.problems.scala

trait P02[T] {
  def penultimate(list: List[T]): Option[T]
}

class P02Impl[T] extends P02[T] {
  override def penultimate(list: List[T]): Option[T] = list match {
    case Nil => None
    case _ :: Nil => None
    case penultimate :: _ :: Nil => Some(penultimate)
    case _ :: tail => penultimate(tail)
  }
}
