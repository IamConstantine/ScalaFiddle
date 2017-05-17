//An example of mixin composition

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next)
}

abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next: T
}

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

object StringIteratorTest {
  def main(args: Array[String]): Unit = {
    class Iter extends StringIterator("Hello World") with RichIterator // mixin composition with RichIterator as a mixin
    val iter = new Iter
    iter foreach println
  }
}
