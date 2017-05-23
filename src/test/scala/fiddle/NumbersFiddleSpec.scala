package fiddle

import org.scalatest.{FlatSpec, Matchers}

class NumbersFiddleSpec extends FlatSpec with Matchers {

  val testVector = Vector(1, 32, 45, 7, 3)
  val numbersFiddle = NumbersFiddle(testVector)

  "A NumbersFiddle" should "create a vector with square of all elements" in {
    assert(numbersFiddle.x == Vector(1, 1024, 2025, 49, 9))
  }
  "A NumbersFiddle" should "sum of all elements of vector" in {
    assert(numbersFiddle.y == 88)
  }
  "A NumbersFiddle" should "square root the sum of all elements of vector" in {
    assert(numbersFiddle.z == 9.38083151964686)
  }
  it should "return median of sequence" in {
    assert(NumbersFiddle.median(1 to 5) == 3)
    assert(NumbersFiddle.median(1 to 4) == 2.5)

    assert(NumbersFiddle.median(Seq(1.1, 2.3, 3.5, 4.0)) == 2.9)
    assert(NumbersFiddle.median(Seq(1.1, 2.3, 3.5, 4.0, 5.6)) == 3.5)
  }
  it should "multiply list and map" in {
    val multiplyListAndMap = NumbersFiddle.multiplyListAndMap((1 to 4).toList, Map(1 -> 3, 3 -> 5))
    assert(multiplyListAndMap == List(3, 15))
  }
  it should "return gcd of two numbers" in {
    NumbersFiddle.gcd(15, 24) should equal(3)
    NumbersFiddle.gcd(3, 15) should equal(3)
    NumbersFiddle.gcd(18, 24) should equal(6)
  }
}
