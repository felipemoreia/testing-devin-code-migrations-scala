package subdomains1to4
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations, SubdomainOp}
import org.apache.spark.sql.DataFrame

object SparkOpInstance3 extends SubdomainOp {
  val randomValue: Int = 6243 // Hardcoded random value

  override def name: String = "SparkOpInstance3"
  override def inputs: Set[String] = Set("SparkOpInstance2") // Reference to SparkOpInstance2 as an input using hardcoded name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue as a hardcoded value
    val _ = this.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
