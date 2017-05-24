package fiddle.mixin.iterator

import org.scalatest.FunSuite

class StringIteratorSuite extends FunSuite {

  test("mixin"){
    class Iter extends StringIterator("Hello World") with RichIterator // mixin composition with RichIterator as a mixin
    val iter = new Iter
    iter foreach println
  }
}
