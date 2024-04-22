package subdomains1to4
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations, SubdomainOp}
import org.apache.spark.sql.DataFrame

object SparkOpInstance4 extends SubdomainOp {
  val randomValue: Int = 3921 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-4"
  override def inputs: Set[String] = Set("SparkOpInstance3") // Reference to SparkOpInstance3 as an input using hardcoded name
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
