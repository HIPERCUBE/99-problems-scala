package ninetynine.problems.scala

trait P26[T] {
  def combinations(n: Int, list: List[T]): List[List[T]]
}

class P26Impl[T] extends P26[T] {
  override def combinations(n: Int, list: List[T]): List[List[T]] = list.combinations(n) toList
}

class P26RecursiveImpl[T] extends P26[T] {
  override def combinations(n: Int, list: List[T]): List[List[T]] = list match {
    case e :: tail if n < list.size => combinations(n - 1, tail).map(e :: _) ++ combinations(n, tail)
    case _ if n == list.size => List(list)
    case Nil => Nil
  }
}