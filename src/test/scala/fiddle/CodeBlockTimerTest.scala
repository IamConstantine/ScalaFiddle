package fiddle

import fiddle.CodeBlockTimer.timeit
import org.scalatest.FunSuite

class CodeBlockTimerTest extends FunSuite {
  test("Code execution time") {
    val result = timeit {
      StringFiddle("It is one thing to praise discipline and another to submit to it").longestWord
    }
    println("Result" + result)
    assert(result == "discipline")
  }
}
