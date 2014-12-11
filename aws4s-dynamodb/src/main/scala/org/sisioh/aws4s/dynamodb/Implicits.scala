package org.sisioh.aws4s.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.document._
import com.amazonaws.services.dynamodbv2.document.internal.{Filter, PageBasedCollection}
import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.dynamodb.document._
import org.sisioh.aws4s.dynamodb.model._

object Implicits extends Implicits

trait Implicits extends AmazonDynamoDBClientImplicits with DocumentImplicits with ModelImplicits

trait AmazonDynamoDBClientImplicits {

  implicit def richAmazonDynamoDBClient(underlying: AmazonDynamoDBClient): RichAmazonDynamoDBClient = new RichAmazonDynamoDBClient(underlying)

}

trait DocumentImplicits {

  implicit def richUpdateItemOutcome(underlying: UpdateItemOutcome): RichUpdateItemOutcome = new RichUpdateItemOutcome(underlying)

  implicit def richTableWriteItems(underlying: TableWriteItems): RichTableWriteItems = new RichTableWriteItems(underlying)

  implicit def richTableKeysAndAttributes(underlying: TableKeysAndAttributes): RichTableKeysAndAttributes = new RichTableKeysAndAttributes(underlying)

  implicit def richPageBasedCollection[T, R](underlying: PageBasedCollection[T, R]): RichPageBasedCollection[T, R] = new RichPageBasedCollection[T, R](underlying)

  implicit def richScanOutcome(underlying: ScanOutcome): RichScanOutcome = new RichScanOutcome(underlying)

  implicit def richRangeKeyCondition(underlying: RangeKeyCondition): RichRangeKeyCondition = new RichRangeKeyCondition(underlying)

  implicit def richQueryOutcome(underlying: QueryOutcome): RichQueryOutcome = new RichQueryOutcome(underlying)

  implicit def richPrimaryKey(underlying: PrimaryKey): RichPrimaryKey = new RichPrimaryKey(underlying)

  implicit def richRichItemCollection[R](underlying: ItemCollection[R]): RichItemCollection[R] = new RichItemCollection[R](underlying)

  implicit def richDynamoDB(underlying: DynamoDB): RichDynamoDB = new RichDynamoDB(underlying)

  implicit def richGetItemOutcome(underlying: GetItemOutcome): RichGetItemOutcome = new RichGetItemOutcome(underlying)

  implicit def richItem(underlying: Item): RichItem = new RichItem(underlying)

  implicit def richIndex(underlying: Index): RichIndex = new RichIndex(underlying)

  implicit def richTable(underlying: Table): RichTable = new RichTable(underlying)

  implicit def richAttributeUpdate(underlying: AttributeUpdate): RichAttributeUpdate = new RichAttributeUpdate(underlying)

  implicit def richFilter[T <: Filter[T]](filter: Filter[T]): RichFilter[T] = new RichFilter[T](filter)

  implicit def richBatchWriteItemOutcome(underlying: BatchWriteItemOutcome): RichBatchWriteItemOutcome = new RichBatchWriteItemOutcome(underlying)

  implicit def richBatchGetItemOutcome(underlying: BatchGetItemOutcome): RichBatchGetItemOutcome = new RichBatchGetItemOutcome(underlying)

}

trait ModelImplicits {

  implicit def richGetItemRequest(underlying : GetItemRequest): RichGetItemRequest = new RichGetItemRequest(underlying)

  implicit def richGetItemResult(underlying: GetItemResult): RichGetItemResult = new RichGetItemResult(underlying)

  implicit def richPutItemRequest(underlying: PutItemRequest): RichPutItemRequest = new RichPutItemRequest(underlying)

  implicit def richPutItemResult(underlying: PutItemResult): RichPutItemResult = new RichPutItemResult(underlying)

  implicit def richConsumedCapacity(underlying: ConsumedCapacity): RichConsumedCapacity = new RichConsumedCapacity(underlying)

  implicit def richCondition(underlying: Condition): RichCondition = new RichCondition(underlying)

  implicit def richBatchGetItemRequest(underlying: BatchGetItemRequest): RichBatchGetItemRequest = new RichBatchGetItemRequest(underlying)

  implicit def richBatchGetItemResult(underlying: BatchGetItemResult): RichBatchGetItemResult = new RichBatchGetItemResult(underlying)

  implicit def richBatchWriteItemRequest(underlying: BatchWriteItemRequest): RichBatchWriteItemRequest = new RichBatchWriteItemRequest(underlying)

  implicit def richBatchWriteItemResult(underlying: BatchWriteItemResult): RichBatchWriteItemResult = new RichBatchWriteItemResult(underlying)

  implicit def richListTablesResult(underlying: ListTablesResult): RichListTablesResult = new RichListTablesResult(underlying)

  implicit def richCreateTableRequest(underlying: CreateTableRequest): RichCreateTableRequest = new RichCreateTableRequest(underlying)

  implicit def richCreateTableResult(underlying: CreateTableResult): RichCreateTableResult = new RichCreateTableResult(underlying)

  implicit def richDeleteItemRequest(underlying: DeleteItemRequest): RichDeleteItemRequest = new RichDeleteItemRequest(underlying)

  implicit def richDeleteItemResult(underlying: DeleteItemResult): RichDeleteItemResult = new RichDeleteItemResult(underlying)

  implicit def richDeleteRequest(underlying: DeleteRequest): RichDeleteRequest = new RichDeleteRequest(underlying)

  implicit def richAttributeValue(underlying: AttributeValue): RichAttributeValue = new RichAttributeValue(underlying)

  implicit def richAttributeValueUpdate(underlying: AttributeValueUpdate): RichAttributeValueUpdate = new RichAttributeValueUpdate(underlying)

  implicit def richDeleteTableRequest(underlying: DeleteTableRequest): RichDeleteTableRequest = new RichDeleteTableRequest(underlying)

  implicit def richDeleteTableResult(underlying: DeleteTableResult): RichDeleteTableResult = new RichDeleteTableResult(underlying)

  implicit def richDescribeTableRequest(underlying: DescribeTableRequest): RichDescribeTableRequest = new RichDescribeTableRequest(underlying)

  implicit def richDescribeTableResult(underlying: DescribeTableResult): RichDescribeTableResult = new RichDescribeTableResult(underlying)
}
