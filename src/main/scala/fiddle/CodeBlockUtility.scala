package fiddle


object CodeBlockUtility {
  def timeit[T](block: => T): T = {
    val startTime = System.nanoTime()
    val result = block
    val endTime = System.nanoTime()
    printf("%d ns to execute the block\n", endTime - startTime)
    result
  }

  case class RetryConfig(retries: Int, sleepDuration: Int)

  def retry[T](block: => T)(implicit retryConfig: RetryConfig): T = {
    var noOfRetries = retryConfig.retries
    var result = None: Option[T]
    do {
      try {
        result = Option(block)
      }
      catch {
        case e: Throwable => {
          noOfRetries = noOfRetries - 1
          if (noOfRetries == 0) throw e
          Thread.sleep(retryConfig.sleepDuration)
        }
      }
    } while (result.isEmpty)
    result.get
  }
}
