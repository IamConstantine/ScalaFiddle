package fiddle

class NumbersFiddle(numbers: Vector[Int]) {

  lazy val x = numbers.map(n => n * n)
  lazy val y = numbers.sum
  lazy val z = Math.sqrt(y)
}

object NumbersFiddle {
  def apply(vector: Vector[Int]) = new NumbersFiddle(vector)

  def median[A](seq: Seq[A])(implicit num: Numeric[A]): Double = {
    import num._
    if (seq.size % 2 == 0) {
      val mid = seq.size / 2
      (seq(mid) + seq(mid - 1)).toDouble / 2
    } else
      seq(seq.size / 2).toDouble
  }

  //def gcd(a: Int, b: Int) = if (b == 0) a else gcd(b, a % b)
  //  def gcd(x: Int, y: Int) = {
  //    var a = x
  //    var b = y
  //    while (b != 0) {
  //      val tmp = a
  //      a = b
  //      b = tmp % b
  //    }
  //    a
  //  }

  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case _ => gcd(b, a % b)
  }

  def multiplyListAndMap(x: List[Int], y: Map[Int, Double]): List[Double] = x.filter(y.contains).map(x => x * y(x))
}
