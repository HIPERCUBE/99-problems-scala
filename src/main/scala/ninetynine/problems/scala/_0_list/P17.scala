package ninetynine.problems.scala._0_list

trait P17[T] {
  def split(n: Int, list: List[T]): (List[T], List[T])
}

class P17Impl[T] extends P17[T] {
  final override def split(n: Int, list: List[T]): (List[T], List[T]) = list.splitAt(n)
}

class P17TakeDropImpl[T] extends P17[T] {
  final override def split(n: Int, list: List[T]): (List[T], List[T]) = (list.take(n), list.drop(n))
}
