package fiddle.utility

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

    def retryMessage = {
      retryConfig.retries - noOfRetries match {
        case 1 => "1 retry "
        case value => "" + value + " retries"
      }
    }

    do {
      try {
        result = Option(block)
      }
      catch {
        case e: Throwable =>
          if (noOfRetries == 0) throw e
          noOfRetries = noOfRetries - 1
          Thread.sleep(retryConfig.sleepDuration)
          println(retryMessage)
      }
    } while (result.isEmpty)
    result.get
  }
}
