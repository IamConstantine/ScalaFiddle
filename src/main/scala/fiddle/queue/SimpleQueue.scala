package fiddle.queue

trait Queue[T] {
  def put(v: T)

  def get: T
}

abstract class SimpleQueue[T] extends Queue[T] {
  var queue = List[T]()

  override def put(v: T) = queue = queue :+ v

  override def get: T = {
    if (queue.isEmpty) throw new NoSuchElementException

    val front = queue.head
    queue = queue.tail
    front
  }

}
