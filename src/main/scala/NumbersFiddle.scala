package fiddle

class NumbersFiddle(numbers: Vector[Int]) {

  lazy val x = numbers.map(n => n * n)
  lazy val y = numbers.sum
  lazy val z = Math.sqrt(y)
}

object NumbersFiddle {
  def apply(vector: Vector[Int]) = new NumbersFiddle(vector)

  def median(seq: Seq[Int]): Double =
    if (seq.size % 2 == 0) {
      val mid = seq.size / 2
      (seq(mid) + seq(mid - 1)) / 2.0
    } else
      seq(seq.size / 2)
}
