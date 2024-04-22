package subdomains.domainA

import org.apache.spark.sql.{DataFrame, SparkSession}
import subdomains.utils.{Metadata, RunConfigurations, SubdomainOp, Input}

object SparkOpInstance3 extends SubdomainOp {
  override def name: String = "SparkOpInstance3"
  override def inputs: Set[Input] = Set(Input(SparkOpInstance2.name)) // Reference to SparkOpInstance2 as an input using object name
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
