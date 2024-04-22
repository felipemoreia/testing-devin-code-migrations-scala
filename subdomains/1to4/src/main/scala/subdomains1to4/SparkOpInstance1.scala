package subdomains1to4

import org.apache.spark.sql.SparkSession

import platform.common_classes.{Input, Metadata, RunConfigurations, SubdomainOp}
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkOpInstance1 extends SubdomainOp {
  val randomValue: Int = 7345 // Hardcoded random value

  override def name: String = "SparkOpInstance1"
  override def inputs: Set[Input] = Set() // No inputs, making it a root
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue as a hardcoded value
    val _ = this.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    // Mock implementation for metadata
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    // Mock implementation for runConfigurations
    new RunConfigurations()
  }
}
