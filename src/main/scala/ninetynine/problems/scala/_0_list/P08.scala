package ninetynine.problems.scala._0_list

trait P08[T] {
  def compress(list: List[T]): List[T]
}

class P08Impl[T] extends P08[T] {
  override def compress(list: List[T]): List[T] = list match {
    case _ :: Nil => list
    case e1 :: e2 :: tail if e1 == e2 => compress(e2 :: tail)
    case head :: tail => head :: compress(tail)
  }
}
