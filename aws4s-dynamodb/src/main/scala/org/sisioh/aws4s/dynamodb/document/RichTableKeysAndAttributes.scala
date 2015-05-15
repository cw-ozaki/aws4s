package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{ PrimaryKey, TableKeysAndAttributes }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object TableKeysAndAttributeFactory {

  def apply(tableName: String): TableKeysAndAttributes = new TableKeysAndAttributes(tableName)

}

class RichTableKeysAndAttributes(val underlying: TableKeysAndAttributes) extends AnyVal with PimpedType[TableKeysAndAttributes] {

  def primaryKeys: Seq[PrimaryKey] = underlying.getPrimaryKeys.asScala.toVector

  def withAttributeNames(attributeNames: Seq[String]): TableKeysAndAttributes = underlying.withAttributeNames(attributeNames.asJava)

  def attributeNames: Set[String] = underlying.getAttributeNames.asScala.toSet

  def tableName: String = underlying.getTableName

  def projectionExpression: String = underlying.getProjectionExpression

  def nameMap: Map[String, String] = underlying.getNameMap.asScala.toMap

  def withNameMap(nameMap: Map[String, String]): TableKeysAndAttributes = underlying.withNameMap(nameMap.asJava)

}
