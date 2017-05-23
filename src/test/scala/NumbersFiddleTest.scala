package fiddle
import org.scalatest.FlatSpec

class NumbersFiddleTest extends FlatSpec {

  val testVector = Vector(1, 32,45, 7, 3)
  val numbersFiddle = new NumbersFiddle(testVector)
  it should "create a vector with square of all elements" in {
    assert(numbersFiddle.x == Vector(1, 1024, 2025, 49, 9))
  }
  it should "sum of all elements of vector" in {
    assert(numbersFiddle.y == 88)
  }
  it should "square root the sum of all elements of vector" in {
    assert(numbersFiddle.z == 9.38083151964686)
  }
}
