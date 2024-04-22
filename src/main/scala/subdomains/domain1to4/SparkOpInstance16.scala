package legacy
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import platform.common_classes.{SparkOp, Metadata, RunConfigurations}

object SparkOpInstance16 extends SparkOp {
  val randomValue: Int = 6729 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-16"
  override def inputs: Set[String] = Set(SparkOpInstance15.name) // Reference to SparkOpInstance15 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = new Metadata()
  override def runConfigurations: RunConfigurations = new RunConfigurations()
}
