package fiddle

object CodeBlockTimer {
  def timeit[R](block: => R): R = {
    val startTime = System.nanoTime()
    val result = block
    val endTime = System.nanoTime()
    printf("%d ns to execute the block\n", endTime - startTime)
    result
  }
}
