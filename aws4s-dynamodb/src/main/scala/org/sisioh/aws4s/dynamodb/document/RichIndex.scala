package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{ Index, Table }
import org.sisioh.aws4s.PimpedType

class RichIndex(val underlying: Index) extends AnyVal with PimpedType[Index] {

  def table: Table = underlying.getTable

  def indexName: String = underlying.getIndexName

}
