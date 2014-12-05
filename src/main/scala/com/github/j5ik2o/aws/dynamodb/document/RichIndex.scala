package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Table, Index}
import com.github.j5ik2o.aws.dynamodb.PimpedType

class RichIndex(val underlying: Index) extends AnyVal with PimpedType[Index] {

  def table: Table = underlying.getTable

  def indexName: String = underlying.getIndexName

}
