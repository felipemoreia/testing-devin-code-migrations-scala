package subdomains.domainA

import org.apache.spark.sql.{DataFrame, SparkSession}
import subdomains.utils.{Metadata, RunConfigurations, SubdomainOp, Input}

object SparkOpInstance1 extends SubdomainOp {
  override def name: String = "SparkOpInstance1"
  override def inputs: Set[Input] = Set() // No inputs, making it a root
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    // Implementation for metadata
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    // Implementation for runConfigurations
    new RunConfigurations()
  }
}
