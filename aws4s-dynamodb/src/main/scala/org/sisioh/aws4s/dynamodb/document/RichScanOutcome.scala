package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, ScanOutcome}
import com.amazonaws.services.dynamodbv2.model.ScanResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ScanOutcomeFactory {

  def apply(result: ScanResult): ScanOutcome = new ScanOutcome(result)

}

class RichScanOutcome(val underlying: ScanOutcome) extends AnyVal with PimpedType[ScanOutcome] {

  def items: Seq[Item] = underlying.getItems.asScala.toVector

  def scanResult: ScanResult = underlying.getScanResult

}
