package ninetynine.problems.scala._0_list

trait P27[T] {
  val p26 = new P26Impl[T]
}

trait P27a[T] extends P27[T] {
  def group3(list: List[T]): List[(List[T], List[T], List[T])]
}

trait P27b[T] extends P27[T] {
  def group(groupSizes: List[Int], list: List[T]): List[List[T]]
}


class P27aImpl[T] extends P27a[T] {
  final override def group3(list: List[T]): List[(List[T], List[T], List[T])] = {
    require(list.size == 9)

    p26.combinations(2, list)
      .flatMap(c2 => p26
        .combinations(3, list diff c2)
        .map(c3 => (c2, c3)))
      .flatMap(c23 => p26
        .combinations(4, list diff c23._1 diff c23._2)
        .map(c4 => (c23._1, c23._2, c4)))
  }
}

class P27aForImpl[T] extends P27a[T] {
  final override def group3(list: List[T]): List[(List[T], List[T], List[T])] = {
    require(list.size == 9)

    for {
      c2 <- p26.combinations(2, list)
      c3 <- p26.combinations(3, list diff c2)
    } yield (c2, c3, list diff c2 diff c3)
  }
}

class P27bImpl[T] extends P27b[T] {
  final override def group(groupSizes: List[Int], list: List[T]): List[List[T]] = groupSizes match {
    case Nil => List(Nil)
    case e :: tail => p26.combinations(e, list) flatMap (c => group(tail, list diff c))
  }
}
