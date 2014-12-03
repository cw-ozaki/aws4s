package com.github.j5ik2o.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient

object Implicits extends Implicits

trait Implicits extends DynamoDBClientImplicits

trait DynamoDBClientImplicits {

  implicit def richDynamoDBClient(client: AmazonDynamoDBClient): RichDynamoDBClient = new RichDynamoDBClient(client)

}
