package ninetynine.problems.scala.list

trait P20[T] {
  def removeAt(n: Int, list: List[T]): (List[T], T)
}

class P20TakeDropImpl[T] extends P20[T] {
  final override def removeAt(n: Int, list: List[T]): (List[T], T) = (list.take(n) ++ list.drop(n + 1), list(n))
}

class P20SplitImpl[T] extends P20[T] {
  final override def removeAt(n: Int, list: List[T]): (List[T], T) = {
    val (first, second) = list.splitAt(n + 1)
    (first.init ++ second, first.last)
  }
}

