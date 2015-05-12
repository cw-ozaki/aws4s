package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, PrimaryKey, TableWriteItems}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object TableWriteItemFactory {

  def apply(tableName: String): TableWriteItems = new TableWriteItems(tableName)

}

class RichTableWriteItems(val underlying: TableWriteItems) extends AnyVal with PimpedType[TableWriteItems] {

  def primaryKeysToDelete: Seq[PrimaryKey] = underlying.getPrimaryKeysToDelete.asScala.toVector

  def withItemsToPut(itemsToPut: Iterable[Item]): TableWriteItems = underlying.withItemsToPut(itemsToPut.toSeq.asJava)

  def itemsToPut: Iterable[Item] = underlying.getItemsToPut.asScala.toVector

  def tableName: String = underlying.getTableName

}
