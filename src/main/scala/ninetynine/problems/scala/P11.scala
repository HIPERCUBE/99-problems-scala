package ninetynine.problems.scala

trait P11[T] {
  def encodeModified(list: List[T]): List[Any]
}

class P11Impl[T] extends P11[T] {
  override def encodeModified(list: List[T]): List[Any] = {
    new P09Impl[T].pack(list).map {
      case packed if packed.size == 1 => packed.head
      case packed => (packed.size, packed.head)
    }
  }
}
