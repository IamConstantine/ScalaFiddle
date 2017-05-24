package fiddle.queue

trait InputReversed extends QueueLike[String] {
  abstract override def put(v: String) = {
    super.put(v.reverse)
  }
}

