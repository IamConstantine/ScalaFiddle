import java.io.{File, FileNotFoundException}

import scala.io.Source

val fileList = new File(".").listFiles()
//Code to create a cartesian using flatmap/map and for comprehensions
val cartesianProduct1 = (1 to 5).flatMap(i => (1 to 5).map(j => (i, j)))
val cartesianProduct2 = for {
  i <- 1 to 5
  j <- 1 to 5
} yield (i, j)

def g(): Int = try { 1 } finally { 2 }
g

def f(): Int = try { return 1 } finally { return 2 }
f


//Ways to iterate over arrays
val a = Array(1, 2, 3, 4)

def fileLines(file: java.io.File) =
  Source.fromFile(file).getLines().toList

//catching Exception using pattern matching
try {
  val files = new File("..").listFiles().toList
} catch {
    case ex: FileNotFoundException => println("File not found")
}

//Using yield to create a new collection
def pythonFiles =
  for {
    file <- fileList
    if file.isFile
  } yield file
pythonFiles

a.foreach(x => println(x))
a foreach (x => println(x))
a foreach (println(_))
a foreach (println)
a foreach println

for (arg <- a)
  println(arg)

0 to 10 foreach println
0.to(10) foreach println

0 until 10 foreach println

//For with multiple filters
for (file <- fileList
     if file.isFile;
     line <- fileLines(file)
     if line.trim.matches("h")
) println(file)

