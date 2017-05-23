package fiddle

object StringIteratorTest {
  def main(args: Array[String]): Unit = {
    class Iter extends StringIterator("Hello World") with RichIterator // mixin composition with RichIterator as a mixin
    val iter = new Iter
    iter foreach println
  }
}
