package fiddle.queue

trait QueueLike[T] {
  def put(v: T)

  def get: T
}
