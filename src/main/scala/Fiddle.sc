"*" * 5

val l = 3 + 4
var capital = Map("US" -> "Washington")
capital += ("France" -> "Paris")

1.0/0.0

"bob" capitalize

"   |Hello" stripMargin

println(capital("France"))

def factorial(x: BigInt): BigInt =
  if (x == 0 || x == 1) 1 else factorial(x - 1) * x

factorial(5)

val shortValue: Short  = -32768

val aBigInteger = BigInt(102)

val testString = "hello World"
testString exists (_.isUpper)

//if as a ternary operator
val x = 3
val y = 4
if (x > y) x else y

//Iterating arrays
val a = Array(1,2,3,4)

a.foreach(x=>println(x))
a foreach(x=>println(x))
a foreach(println(_))
a foreach(println)
a foreach println

for (arg <- a)
  println(arg)

0 to 10 foreach println
0.to(10) foreach println

def g() = {
  "this String gets lost too"
}

//:: cons operator
val list =  List(1,2,3)
0::list
List(0):::list




