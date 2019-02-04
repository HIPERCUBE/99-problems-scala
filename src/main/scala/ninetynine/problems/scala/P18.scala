package ninetynine.problems.scala

trait P18[T] {
  def slice(i: Int, k: Int, list: List[T]): List[T]
}

class P18Impl[T] extends P18[T] {
  final override def slice(i: Int, k: Int, list: List[T]): List[T] = list.slice(i, k)
}

class P18TakeDropImpl[T] extends P18[T] {
  final override def slice(i: Int, k: Int, list: List[T]): List[T] = list.drop(i).take(k - i)
}

class P18RecursiveImpl[T] extends P18[T] {
  final override def slice(i: Int, k: Int, list: List[T]): List[T] = {
    def sliceR(i: Int, k: Int, list: List[T]): List[T] = list match {
      case _ :: tail if i > 0 => sliceR(i - 1, k - 1, tail)
      case e :: tail if i <= 0 && k > 0 => e :: sliceR(i - 1, k - 1, tail)
      case _ => Nil
    }

    sliceR(i, k, list)
  }
}

// 2 4  1 2 3 4 5
// 1 3  2 3 4 5
// 0 2  3 4 5
// 3  -1 1  4 5
// 3 4  -2 0  5
// 3 4  -3 -1
