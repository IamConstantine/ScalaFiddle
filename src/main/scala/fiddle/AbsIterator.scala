package fiddle

abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next: T
}
