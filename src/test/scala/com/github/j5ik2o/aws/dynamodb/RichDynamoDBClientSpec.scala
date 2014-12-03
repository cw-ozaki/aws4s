package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.model.{AttributeDefinition, KeySchemaElement, ProvisionedThroughput}
import com.github.j5ik2o.aws.dynamodb.Implicits._
import org.scalatest.FunSpec

class RichDynamoDBClientSpec extends FunSpec {

  describe("RichDynamoDBClient") {
    it("createTableできること") {
      val dynamo = new AmazonDynamoDBClient()
      dynamo.createTable(Seq(new AttributeDefinition()), "test", Seq(new KeySchemaElement()), new ProvisionedThroughput)
    }
  }

}
