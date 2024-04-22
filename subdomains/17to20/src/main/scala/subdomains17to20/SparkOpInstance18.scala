package subdomains17to20
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import platform.common_classes.{Input, Metadata, RunConfigurations, SubdomainOp}

object SparkOpInstance18 extends SubdomainOp {
  val randomValue: Int = 2763 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-18"
  override def inputs: Set[Input] = Set() // No inputs as per SubdomainOp trait
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue as a hardcoded value
    val _ = this.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = new Metadata()
  override def runConfigurations: RunConfigurations = new RunConfigurations()
}
