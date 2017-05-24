package fiddle

import fiddle.CodeBlockUtility.{RetryConfig, retry, timeit}
import org.scalatest.FunSuite

class CodeBlockUtilityTest extends FunSuite {
  test("Code execution time") {
    val result = timeit {
      StringFiddle("It is one thing to praise discipline and another to submit to it").longestWord
    }
    println("Result" + result)
    assert(result == "discipline")
  }
  test("retry code block ") {
    implicit val retryConfig = RetryConfig(3, 10)
    var counter = 3
    val result = retry {
      if (counter > 0) {
        counter = counter - 1
        throw new RuntimeException
      }
      counter
    }
    assert(counter == 0)
  }
}
