package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.document._
import com.amazonaws.services.dynamodbv2.model.TableDescription
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object TableFactory {

  def apply(client: AmazonDynamoDB, tableName: String): Table = new Table(client, tableName)

  def apply(client: AmazonDynamoDB, tableName: String, tableDescription: TableDescription): Table = new Table(client, tableName, tableDescription)

}

class RichTable(val underlying: Table) extends AnyVal with PimpedType[Table] {

  def tableName: String = underlying.getTableName

  def description: TableDescription = underlying.getDescription

  def deleteItem(primaryKey: PrimaryKey, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): DeleteItemOutcome =
    underlying.deleteItem(primaryKey, conditionExpression, nameMap.asJava, valueMap.asJava)

  def deleteItem(hashKeyName: String, hashKeyValue: AnyRef, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): DeleteItemOutcome =
    underlying.deleteItem(hashKeyName, hashKeyValue, conditionExpression, nameMap.asJava, valueMap.asJava)

  def deleteItem(hashKeyName: String, hashKeyValue: AnyRef, rangeKeyName: String, rangeKeyValue: AnyRef, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): DeleteItemOutcome =
    underlying.deleteItem(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue, conditionExpression, nameMap.asJava, valueMap.asJava)

  def getItem(primaryKey: PrimaryKey, projectionExpression: String, nameMap: Map[String, String]): Item =
    underlying.getItem(primaryKey, projectionExpression, nameMap.asJava)

  def getItem(hashKeyName: String, hashKeyValue: AnyRef, projectionExpression: String, nameMap: Map[String, String]): Item =
    underlying.getItem(hashKeyName, hashKeyValue, projectionExpression, nameMap.asJava)

  def getItemOutcome(primaryKey: PrimaryKey, projectionExpression: String, nameMap: Map[String, String]): GetItemOutcome =
    underlying.getItemOutcome(primaryKey, projectionExpression, nameMap.asJava)

  def getItemOutcome(hashKeyName: String, hashKeyValue: AnyRef, projectionExpression: String, nameMap: Map[String, String]): GetItemOutcome =
    underlying.getItemOutcome(hashKeyName, hashKeyValue, projectionExpression, nameMap.asJava)

  def getItemOutcome(hashKeyName: String, hashKeyValue: AnyRef, rangeKeyName: String, rangeKeyValue: AnyRef, projectionExpression: String, nameMap: Map[String, String]): GetItemOutcome =
    underlying.getItemOutcome(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue, projectionExpression, nameMap.asJava)

  def putItem(item: Item, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): PutItemOutcome =
    underlying.putItem(item, conditionExpression, nameMap.asJava, valueMap.asJava)

  def query(hashKey: KeyAttribute, rangeKeyCondition: RangeKeyCondition, filterExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): ItemCollection[QueryOutcome] =
    underlying.query(hashKey, rangeKeyCondition, filterExpression, nameMap.asJava, valueMap.asJava)

  def query(hashKey: KeyAttribute, rangeKeyCondition: RangeKeyCondition, filterExpression: String, projectionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): ItemCollection[QueryOutcome] =
    underlying.query(hashKey, rangeKeyCondition, filterExpression, projectionExpression, nameMap.asJava, valueMap.asJava)

  def scan(filterExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): ItemCollection[ScanOutcome] =
    underlying.scan(filterExpression, nameMap.asJava, valueMap.asJava)

  def scan(filterExpression: String, projectionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): ItemCollection[ScanOutcome] =
    underlying.scan(filterExpression, projectionExpression, nameMap.asJava, valueMap.asJava)

  //  def updateItem(primaryKey: PrimaryKey, expected: Iterable[Expected], attributeUpdates: RichAttributeUpdate*): UpdateItemOutcome =
  //    underlying.updateItem(primaryKey, expected.toSeq.asJava, attributeUpdates: _*)

  def updateItem(primaryKey: PrimaryKey, updateExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): UpdateItemOutcome =
    underlying.updateItem(primaryKey, updateExpression, nameMap.asJava, valueMap.asJava)

  def updateItem(primaryKey: PrimaryKey, updateExpression: String, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): UpdateItemOutcome =
    underlying.updateItem(primaryKey, updateExpression, conditionExpression, nameMap.asJava, valueMap.asJava)

  //  def  updateItem(hashKeyName: String, hashKeyValue: AnyRef, expected: Iterable[Expected], attributeUpdates: RichAttributeUpdate*): UpdateItemOutcome =
  //    underlying.updateItem(hashKeyName, hashKeyValue, expected.toSeq.asJava, attributeUpdates: _*)

  def updateItem(hashKeyName: String, hashKeyValue: AnyRef, updateExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): UpdateItemOutcome =
    underlying.updateItem(hashKeyName, hashKeyValue, updateExpression, nameMap.asJava, valueMap.asJava)

  //  def  updateItem(hashKeyName: String, hashKeyValue: AnyRef, rangeKeyName: String, rangeKeyValue: AnyRef, expected: Iterable[Expected], attributeUpdates: RichAttributeUpdate *): UpdateItemOutcome =
  //    underlying.updateItem(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue, expected.toSeq.asJava, attributeUpdates: _*)

  def updateItem(hashKeyName: String, hashKeyValue: AnyRef, rangeKeyName: String, rangeKeyValue: AnyRef, updateExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): UpdateItemOutcome =
    underlying.updateItem(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue, updateExpression, nameMap.asJava, valueMap.asJava)

  def updateItem(hashKeyName: String, hashKeyValue: AnyRef, rangeKeyName: String, rangeKeyValue: AnyRef, updateExpression: String, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): UpdateItemOutcome =
    underlying.updateItem(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue, updateExpression, conditionExpression, nameMap.asJava, valueMap.asJava)

  def updateItem(hashKeyName: String, hashKeyValue: AnyRef, updateExpression: String, conditionExpression: String, nameMap: Map[String, String], valueMap: Map[String, AnyRef]): UpdateItemOutcome =
    underlying.updateItem(hashKeyName, hashKeyValue, updateExpression, conditionExpression, nameMap.asJava, valueMap.asJava)

}
