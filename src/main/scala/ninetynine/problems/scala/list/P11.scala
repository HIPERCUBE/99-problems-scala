package ninetynine.problems.scala.list

trait P11[T] {
  def encodeModified(list: List[T]): List[Any]
}

class P11Impl[T] extends P11[T] {
  override def encodeModified(list: List[T]): List[Any] = {
    new P10Impl[T].encode(list).map {
      case (1, x) => x
      case e => e
    }
  }
}
