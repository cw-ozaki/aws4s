package org.sisioh.aws4s.dynamodb

import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.dynamodbv2.local.server.{ DynamoDBProxyServer, LocalDynamoDBRequestHandler, LocalDynamoDBServerHandler }
import com.amazonaws.services.dynamodbv2.model._
import org.scalatest.FunSpec
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.CreateTableRequestFactory

class RichDynamoDBClientSpec extends FunSpec {

  def createServer: DynamoDBProxyServer = {
    val port = 8000
    val inMemory = true
    val dbPath = null
    val sharedDb = false
    val corsParams = null
    val delayTransientStatuses = false
    new DynamoDBProxyServer(port, new LocalDynamoDBServerHandler(new LocalDynamoDBRequestHandler(0, inMemory, dbPath, sharedDb, delayTransientStatuses), corsParams))
  }

  describe("RichDynamoDBClient") {
    it("createTableできること") {
      val server = createServer
      server.start()

      val dynamo = AmazonDynamoDBClientFactory.create(new BasicAWSCredentials("x", "x"))
      dynamo.setEndpoint("http://localhost:8000")

      val req = CreateTableRequestFactory.create().
        withTableNameOpt(Some("test")).
        withKeySchemaOpt(Some(Seq(new KeySchemaElement("Id", KeyType.HASH)))).
        withAttributeDefinitionsOpt(Some(Seq(new AttributeDefinition("Id", ScalarAttributeType.N)))).
        withProvisionedThroughputOpt(Some(new ProvisionedThroughput(10L, 10L)))

      val createTableResult = dynamo.createTable(req)

      val td = createTableResult.tableDescriptionOpt
      println(td)

      val result = dynamo.listTables(10)

      val d = dynamo.describeTable("test")

      println(d.tableOpt)

      println(result.tableNamesOpt)

      server.stop()
    }
  }

}
