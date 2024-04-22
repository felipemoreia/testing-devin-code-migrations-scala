package subdomains13to16
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Input, Metadata, RunConfigurations, SubdomainOp}
import org.apache.spark.sql.DataFrame

object SparkOpInstance13 extends SubdomainOp {
  val randomValue: Int = 7854 // Hardcoded random value

  override def name: String = "nu-br/dataset/spark-op-instance-13"
  override def inputs: Set[Input] = Set() // No inputs as per SubdomainOp trait
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
