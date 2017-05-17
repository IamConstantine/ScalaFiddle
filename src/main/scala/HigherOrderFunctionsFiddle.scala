import java.io.File

//Refer Programming in scala 2nd edition chapter 9 - higher order funcitons
object FileMatcher {
  private def filesHere = new File(".").listFiles()

  def filesEnding(query: String) = {
    filesMatching( _.endsWith(query))
  }

  def filesContaning(query: String) = {
    filesMatching(_.contains(query))
  }

  def filesRegex(query: String) = {
    filesMatching(_.matches(query))
  }

  def filesMatching(matcher: String => Boolean) = {
    for {file <- filesHere
         if matcher(file.getName)
    } yield file
  }
}