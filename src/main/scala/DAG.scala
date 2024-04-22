import subdomains.domainA.{SparkOpInstance1, SparkOpInstance2, SparkOpInstance3, SparkOpInstance4, SparkOpInstance5}

object DAG {
  val ops: Set[SubdomainOp] = Set(
    SparkOpInstance1,
    SparkOpInstance2,
    SparkOpInstance3,
    SparkOpInstance4,
    SparkOpInstance5
    // Note: SparkOpInstance6 to SparkOpInstance20 need to be defined and imported if they exist
  )
}
