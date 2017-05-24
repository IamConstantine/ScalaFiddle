package fiddle.mixin.iterator

abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next: T
}
