package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.local.server.{DynamoDBProxyServer, LocalDynamoDBRequestHandler, LocalDynamoDBServerHandler}
import com.amazonaws.services.dynamodbv2.model._
import com.github.j5ik2o.aws.dynamodb.Implicits._
import com.github.j5ik2o.aws.dynamodb.model.CreateTableRequestFactory
import org.scalatest.FunSpec

class RichDynamoDBClientSpec extends FunSpec {

  def createServer: DynamoDBProxyServer = {
    val port = 8000
    val inMemory = true
    val dbPath = null
    val sharedDb = false
    val corsParams = null
    new DynamoDBProxyServer(port, new LocalDynamoDBServerHandler(new LocalDynamoDBRequestHandler(0, inMemory, dbPath, sharedDb), corsParams))
  }

  describe("RichDynamoDBClient") {
    it("createTableできること") {
      val server = createServer
      server.start()

      val dynamo = AmazonDynamoDBClientFactory()
      dynamo.setEndpoint("http://localhost:8000")

      val req = CreateTableRequestFactory().
        withTableName("test").
        withKeySchema(Seq(new KeySchemaElement("Id", KeyType.HASH))).
        withAttributeDefinitions(Seq(new AttributeDefinition("Id", ScalarAttributeType.N))).
        withProvisionedThroughput(new ProvisionedThroughput(10L, 10L))

      val createTableResult = dynamo.createTable(req)

      val td = createTableResult.tableDescription
      println(td)

      val result = dynamo.listTables(10)
      println(result.tableNames)

      server.stop()
    }
  }

}
