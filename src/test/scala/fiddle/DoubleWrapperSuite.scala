package fiddle

import org.scalatest.FunSuite

class DoubleWrapperSuite extends FunSuite {

  test("double value comparison"){
    implicit def doubleToDoubleWrapper(d: Double): DoubleWrapper = new DoubleWrapper(d)
    implicit val precision = Precision(0.001)
    assert(0.0 ~= 0.00001)
  }

}
