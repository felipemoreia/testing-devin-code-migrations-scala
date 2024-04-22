package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.SparkOp
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance10 extends SparkOp {
  val randomValue: Int = 9034 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-10"
  override def inputs: Set[String] = Set(SparkOpInstance9.name) // Reference to SparkOpInstance9 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance9 as instructed
    val _ = SparkOpInstance9.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
