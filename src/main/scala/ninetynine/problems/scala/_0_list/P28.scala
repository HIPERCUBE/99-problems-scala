package ninetynine.problems.scala._0_list

trait P28[T] {
}

trait P28a[T] extends P28[T] {
  def lsort(list: List[List[T]]): List[List[T]]
}

trait P28b[T] extends P28[T] {
  def lsortFreq(list: List[List[T]]): List[List[T]]
}


class P28aImpl[T] extends P28a[T] {
  final override def lsort(list: List[List[T]]): List[List[T]] = list.sortBy(_.size)
}

class P28bImpl[T] extends P28b[T] {
  override def lsortFreq(list: List[List[T]]): List[List[T]] = list
    .groupBy(_.size).values.toList
    .sortBy(_.size)
    .flatten
}