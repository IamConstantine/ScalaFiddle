package fiddle.queue

abstract class Queueable[T] extends QueueLike[T] {
  var queue = List[T]()

  override def put(v: T) = queue = queue :+ v

  override def get: T = {
    if (queue.isEmpty) throw new NoSuchElementException

    val front = queue.head
    queue = queue.tail
    front
  }
}
class IntQueue extends Queueable[Int]
class StringQueue extends Queueable[String] with InputReversed
