package subdomains.domain1to4
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import subdomains.utils.{SubdomainOp, Metadata, RunConfigurations, Input}

object SparkOpInstance20 extends SubdomainOp {
  val randomValue: Int = 9537 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-20"
  override def inputs: Set[Input] = Set(Input(SparkOpInstance19.name)) // Reference to SparkOpInstance19 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
