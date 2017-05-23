package fiddle

class NumbersFiddle(numbers: Vector[Int]) {

  lazy val x = numbers.map(n => n * n)
  lazy val y = numbers.sum
  lazy val z = Math.sqrt(y)
}
