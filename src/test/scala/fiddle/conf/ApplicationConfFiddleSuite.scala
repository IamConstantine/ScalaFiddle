package fiddle.conf

import com.typesafe.config.ConfigFactory
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.JavaConverters._

class ApplicationConfFiddleSuite extends FlatSpec with Matchers {

  it should "read list from application conf" in {
    val config = ConfigFactory.load()
    val confs: Seq[String] = config.getStringList("conf.mylist").asScala
    confs should equal(Seq("AA", "BB"))
  }
}
