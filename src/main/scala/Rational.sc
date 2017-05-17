class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = numer + "/" + denom

  def +(that: Rational) = add(that)

  def *(that: Rational) = Rational(that.numer * numer, that.denom * denom)

  def *(i: Int) = Rational(i * numer, denom)


  def add(that: Rational) = {
    Rational(that.numer * denom + that.denom * numer, that.denom * denom)
  }

  def <(that: Rational) = {
    that.denom * numer < denom * that.numer
  }

  def lessThan(that: Rational) = {
    that.denom * numer < denom * that.numer
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

object Rational {
  def apply(n: Int, d: Int): Rational = new Rational(n, d)

  def apply(n: Int): Rational = new Rational(n, 1)
}

//implicit to convert 2 to Rational implicitly
implicit def intToRational(x: Int) = new Rational(x)

Rational(5)
Rational(4, 3) add Rational(5, 3)
Rational(4, 3) + Rational(5, 3)
Rational(14, 3) lessThan Rational(5, 3)
Rational(4, 3) < Rational(5, 3)
Rational(4, 3) * Rational(5, 3)
Rational(4, 3) * Rational(5, 3) * 2
2 * Rational(5, 3) //2 converted implicitly to Rational
//new Rational(4, 0)