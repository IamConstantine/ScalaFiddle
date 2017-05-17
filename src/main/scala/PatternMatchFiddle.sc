def factorial(n: Int): Int =
  n match {
    case 0 => 1
    case 1 => 1
    case _ => factorial(n - 1) * n
  }
factorial(4)

def fibonacci(n : Int): Int =
n match {
  case 0 => 1
  case 1 => 1
  case _ => fibonacci(n-1) + fibonacci(n-2)
}
fibonacci(4)

def gcd(a: Int, b: Int): Int =
b match {
  case 0 => a
  case _ => gcd(b, a%b)
}
gcd(24,16)
