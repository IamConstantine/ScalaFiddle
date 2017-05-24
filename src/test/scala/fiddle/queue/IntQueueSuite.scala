package fiddle.queue

import org.scalatest.FunSuite

class IntQueueSuite extends FunSuite {

  test("queue operation") {
    val simpleQueue = new IntQueue

    simpleQueue.put(10)
    assert(simpleQueue.queue == List(10))
  }

  test("dequeue operation") {
    val simpleQueue = new IntQueue

    simpleQueue.put(10)
    simpleQueue.put(20)
    assert(simpleQueue.queue == List(10, 20))

    assert(simpleQueue.get == 10)
    assert(simpleQueue.queue == List(20))
  }

  test("empty queue exception"){
    val simpleQueue = new IntQueue

    assertThrows[NoSuchElementException]{
      simpleQueue.get
    }
  }
}
