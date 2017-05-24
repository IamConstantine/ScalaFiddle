package fiddle.queue

import org.scalatest.FunSuite

class StringQueueSuite extends FunSuite {
  test("stackable behavior"){
    val stringQueue = new StringQueue
    val HELLO = "Hello"
    stringQueue.put(HELLO)
    assert(stringQueue.get==HELLO.reverse)
  }
}
