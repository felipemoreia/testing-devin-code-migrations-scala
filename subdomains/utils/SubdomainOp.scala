package subdomains.utils

import org.apache.spark.sql.DataFrame

case class Input(name: String)

trait SubdomainOp {
  def name: String
  def inputs: Set[Input]
  def query(inputs: Map[String, DataFrame]): DataFrame
  def metadata: Metadata
  def runConfigurations: RunConfigurations
}
