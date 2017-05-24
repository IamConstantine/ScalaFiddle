package fiddle.utility

import fiddle.utility.FiddleUtility.coalesce
import org.scalatest.FunSuite

class FiddleUtilitySuite extends FunSuite {

  test("coalesce") {
    assert(coalesce(None, None, None, Option("Hello"), Option("World")).get == "Hello")
    assert(coalesce(None, None).get == None)
  }

}
