package fiddle.mixin.iterator

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0

  def hasNext: Boolean = i < s.length

  def next: T = {
    val ch: Char = s charAt i
    i += 1
    ch
  }
}
