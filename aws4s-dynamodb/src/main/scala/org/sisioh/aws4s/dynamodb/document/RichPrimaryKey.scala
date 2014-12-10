package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{KeyAttribute, PrimaryKey}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PrimaryKeyFactory {

  def apply(): PrimaryKey = new PrimaryKey()

  def apply(components: KeyAttribute*): PrimaryKey = new PrimaryKey(components: _*)

  def apply(hashKeyName: String, hashKeyValue: AnyRef): PrimaryKey = new PrimaryKey(hashKeyName, hashKeyValue)

  def apply(hashKeyName: String, hashKeyValue: AnyRef, rangeKeyName: String, rangeKeyValue: AnyRef): PrimaryKey =
    new PrimaryKey(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue)

}

class RichPrimaryKey(val underlying: PrimaryKey) extends AnyVal with PimpedType[PrimaryKey] {

  def components: Iterable[KeyAttribute] = underlying.getComponents.asScala

  def componentNameSet: Set[String] = underlying.getComponentNameSet.asScala.toSet

}
