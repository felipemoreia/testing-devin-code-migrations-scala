package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations, SparkOp}
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkOpInstance1 extends SparkOp {
  val randomValue: Int = 7345 // Hardcoded random value

  override def name: String = "SparkOpInstance1"
  override def inputs: Set[String] = Set() // No inputs, making it a root
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance20 as instructed
    val _ = SparkOpInstance20.randomValue
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
