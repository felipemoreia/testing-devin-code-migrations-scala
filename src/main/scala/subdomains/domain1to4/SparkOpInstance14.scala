package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.SparkOp
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance14 extends SparkOp {
  val randomValue: Int = 4621 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-14"
  override def inputs: Set[String] = Set(SparkOpInstance13.name) // Reference to SparkOpInstance13 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance13 as instructed
    val _ = SparkOpInstance13.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
