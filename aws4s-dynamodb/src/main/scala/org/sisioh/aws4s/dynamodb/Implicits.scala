package org.sisioh.aws4s.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.document._
import com.amazonaws.services.dynamodbv2.document.internal.{Filter, PageBasedCollection}
import com.amazonaws.services.dynamodbv2.model._
import org.sisioh.aws4s.dynamodb.document._
import org.sisioh.aws4s.dynamodb.model._

object Implicits extends Implicits

trait Implicits extends DocumentImplicits with ModelImplicits {

  implicit def richAmazonDynamoDBClient(underlying: AmazonDynamoDBClient): RichAmazonDynamoDBClient = new RichAmazonDynamoDBClient(underlying)

}

trait DocumentImplicits {

  implicit def richAttribute(underlying: Attribute): RichAttribute = new RichAttribute(underlying)

  implicit def richAttributeUpdate(underlying: AttributeUpdate): RichAttributeUpdate = new RichAttributeUpdate(underlying)

  implicit def richBatchGetItemOutcome(underlying: BatchGetItemOutcome): RichBatchGetItemOutcome = new RichBatchGetItemOutcome(underlying)

  implicit def richBatchWriteItemOutcome(underlying: BatchWriteItemOutcome): RichBatchWriteItemOutcome = new RichBatchWriteItemOutcome(underlying)

  implicit def richDeleteItemOutcome(underlying: DeleteItemOutcome): RichDeleteItemOutcome = new RichDeleteItemOutcome(underlying)

  implicit def richDynamoDB(underlying: DynamoDB): RichDynamoDB = new RichDynamoDB(underlying)

  implicit def richExpected(underlying: Expected): RichExpected = new RichExpected(underlying)

  implicit def richFilter[A <: Filter[A]](underlying: Filter[A]): RichFilter[A] = new RichFilter[A](underlying)

  implicit def richGetItemOutcome(underlying: GetItemOutcome): RichGetItemOutcome = new RichGetItemOutcome(underlying)

  implicit def richIndex(underlying: Index): RichIndex = new RichIndex(underlying)

  implicit def richItem(underlying: Item): RichItem = new RichItem(underlying)

  implicit def richItemCollection[A](underlying: ItemCollection[A]): RichItemCollection[A] = new RichItemCollection(underlying)

  implicit def richPage[A,B](underlying: Page[A,B]): RichPage[A, B] = new RichPage(underlying)

  implicit def richPageBasedCollection[A, B](underlying: PageBasedCollection[A, B]): RichPageBasedCollection[A, B] = new RichPageBasedCollection(underlying)

  implicit def richPrimaryKey(underlying: PrimaryKey): RichPrimaryKey = new RichPrimaryKey(underlying)

  implicit def richPutItemOutcome(underlying: PutItemOutcome): RichPutItemOutcome = new RichPutItemOutcome(underlying)

  implicit def richQueryOutcome(underlying: QueryOutcome): RichQueryOutcome = new RichQueryOutcome(underlying)

  implicit def richRangeKeyCondition(underlying: RangeKeyCondition): RichRangeKeyCondition = new RichRangeKeyCondition(underlying)

  implicit def richScanOutcome(underlying: ScanOutcome): RichScanOutcome = new RichScanOutcome(underlying)

  implicit def richTable(underlying: Table): RichTable = new RichTable(underlying)

  implicit def richTableKeysAndAttributes(underlying: TableKeysAndAttributes): RichTableKeysAndAttributes = new RichTableKeysAndAttributes(underlying)

  implicit def richTableWriteItems(underlying: TableWriteItems): RichTableWriteItems = new RichTableWriteItems(underlying)

  implicit def richUpdateItemOutcome(underlying: UpdateItemOutcome): RichUpdateItemOutcome = new RichUpdateItemOutcome(underlying)
}

trait ModelImplicits {

  implicit def richAttributeDefinition(underlying: AttributeDefinition): RichAttributeDefinition = new RichAttributeDefinition(underlying)

  implicit def richAttributeValue(underlying: AttributeValue): RichAttributeValue = new RichAttributeValue(underlying)

  implicit def richAttributeValueUpdate(underlying: AttributeValueUpdate): RichAttributeValueUpdate = new RichAttributeValueUpdate(underlying)

  implicit def richBatchGetItemRequest(underlying: BatchGetItemRequest): RichBatchGetItemRequest = new RichBatchGetItemRequest(underlying)

  implicit def richBatchGetItemResult(underlying: BatchGetItemResult): RichBatchGetItemResult = new RichBatchGetItemResult(underlying)

  implicit def richBatchWriteItemRequest(underlying: BatchWriteItemRequest): RichBatchWriteItemRequest = new RichBatchWriteItemRequest(underlying)

  implicit def richBatchWriteItemResult(underlying: BatchWriteItemResult): RichBatchWriteItemResult = new RichBatchWriteItemResult(underlying)

  implicit def richCapacity(underlying: Capacity): RichCapacity = new RichCapacity(underlying)

  implicit def richCondition(underlying: Condition): RichCondition = new RichCondition(underlying)

  implicit def richConsumedCapacity(underlying: ConsumedCapacity): RichConsumedCapacity = new RichConsumedCapacity(underlying)

  implicit def richCreateGlobalSecondaryIndexAction(underlying: CreateGlobalSecondaryIndexAction): RichCreateGlobalSecondaryIndexAction = new RichCreateGlobalSecondaryIndexAction(underlying)

  implicit def richCreateTableRequest(underlying: CreateTableRequest): RichCreateTableRequest = new RichCreateTableRequest(underlying)

  implicit def richCreateTableResult(underlying: CreateTableResult): RichCreateTableResult = new RichCreateTableResult(underlying)

  implicit def richDeleteGlobalSecondaryIndexAction(underlying: DeleteGlobalSecondaryIndexAction): RichDeleteGlobalSecondaryIndexAction = new RichDeleteGlobalSecondaryIndexAction(underlying)

  implicit def richDeleteItemRequest(underlying: DeleteItemRequest): RichDeleteItemRequest = new RichDeleteItemRequest(underlying)

  implicit def richDeleteItemResult(underlying: DeleteItemResult): RichDeleteItemResult = new RichDeleteItemResult(underlying)

  implicit def richDeleteRequest(underlying: DeleteRequest): RichDeleteRequest = new RichDeleteRequest(underlying)

  implicit def richDeleteTableRequest(underlying: DeleteTableRequest): RichDeleteTableRequest = new RichDeleteTableRequest(underlying)

  implicit def richDeleteTableResult(underlying: DeleteTableResult): RichDeleteTableResult = new RichDeleteTableResult(underlying)

  implicit def richDescribeTableRequest(underlying: DescribeTableRequest): RichDescribeTableRequest = new RichDescribeTableRequest(underlying)

  implicit def richDescribeTableResult(underlying: DescribeTableResult): RichDescribeTableResult = new RichDescribeTableResult(underlying)

  implicit def richExpectedAttributeValue(underlying: ExpectedAttributeValue): RichExpectedAttributeValue = new RichExpectedAttributeValue(underlying)

  implicit def richGetItemRequest(underlying: GetItemRequest): RichGetItemRequest = new RichGetItemRequest(underlying)

  implicit def richGetItemResult(underlying: GetItemResult): RichGetItemResult = new RichGetItemResult(underlying)

  implicit def richGlobalSecondaryIndex(underlying: GlobalSecondaryIndex): RichGlobalSecondaryIndex = new RichGlobalSecondaryIndex(underlying)

  implicit def richGlobalSecondaryIndexDescription(underlying: GlobalSecondaryIndexDescription): RichGlobalSecondaryIndexDescription = new RichGlobalSecondaryIndexDescription(underlying)

  implicit def richGlobalSecondaryIndexUpdate(underlying: GlobalSecondaryIndexUpdate): RichGlobalSecondaryIndexUpdate = new RichGlobalSecondaryIndexUpdate(underlying)

  implicit def richItemCollectionMetrics(underlying: ItemCollectionMetrics): RichItemCollectionMetrics = new RichItemCollectionMetrics(underlying)

  implicit def richKeysAndAttributes(underlying: KeysAndAttributes): RichKeysAndAttributes = new RichKeysAndAttributes(underlying)

  implicit def richKeySchemaElement(underlying: KeySchemaElement): RichKeySchemaElement = new RichKeySchemaElement(underlying)

  implicit def richListTablesRequest(underlying: ListTablesRequest): RichListTablesRequest = new RichListTablesRequest(underlying)

  implicit def richListTablesResult(underlying: ListTablesResult): RichListTablesResult = new RichListTablesResult(underlying)

  implicit def richLocalSecondaryIndex(underlying: LocalSecondaryIndex): RichLocalSecondaryIndex = new RichLocalSecondaryIndex(underlying)

  implicit def richLocalSecondaryIndexDescription(underlying: LocalSecondaryIndexDescription): RichLocalSecondaryIndexDescription = new RichLocalSecondaryIndexDescription(underlying)

  implicit def richProjection(underlying: Projection): RichProjection = new RichProjection(underlying)

  implicit def richProvisionedThroughput(underlying: ProvisionedThroughput): RichProvisionedThroughput = new RichProvisionedThroughput(underlying)

  implicit def richProvisionedThroughputDescription(underlying: ProvisionedThroughputDescription): RichProvisionedThroughputDescription = new RichProvisionedThroughputDescription(underlying)

  implicit def richPutItemRequest(underlying: PutItemRequest): RichPutItemRequest = new RichPutItemRequest(underlying)

  implicit def richPutItemResult(underlying: PutItemResult): RichPutItemResult = new RichPutItemResult(underlying)

  implicit def richPutRequest(underlying: PutRequest): RichPutRequest = new RichPutRequest(underlying)

  implicit def richQueryRequest(underlying: QueryRequest): RichQueryRequest = new RichQueryRequest(underlying)

  implicit def richQueryResult(underlying: QueryResult): RichQueryResult = new RichQueryResult(underlying)

  implicit def richScanRequest(underlying: ScanRequest): RichScanRequest = new RichScanRequest(underlying)

  implicit def richScanResult(underlying: ScanResult): RichScanResult = new RichScanResult(underlying)

  implicit def richTableDescription(underlying: TableDescription): RichTableDescription = new RichTableDescription(underlying)

  implicit def richUpdateGlobalSecondaryIndexAction(underlying: UpdateGlobalSecondaryIndexAction): RichUpdateGlobalSecondaryIndexAction = new RichUpdateGlobalSecondaryIndexAction(underlying)

  implicit def richUpdateItemRequest(underlying: UpdateItemRequest): RichUpdateItemRequest = new RichUpdateItemRequest(underlying)

  implicit def richUpdateItemResult(underlying: UpdateItemResult): RichUpdateItemResult = new RichUpdateItemResult(underlying)

  implicit def richUpdateTableRequest(underlying: UpdateTableRequest): RichUpdateTableRequest = new RichUpdateTableRequest(underlying)

  implicit def richUpdateTableResult(underlying: UpdateTableResult): RichUpdateTableResult = new RichUpdateTableResult(underlying)

  implicit def richWriteRequest(underlying: WriteRequest): RichWriteRequest = new RichWriteRequest(underlying)

}
