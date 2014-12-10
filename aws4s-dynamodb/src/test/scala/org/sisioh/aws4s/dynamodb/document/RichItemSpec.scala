package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{AttributeUpdate, Item}
import org.sisioh.aws4s.dynamodb.Implicits._
import org.scalatest.FunSpec

class RichItemSpec extends FunSpec {

  describe("") {
    it("") {
      val au = new AttributeUpdate("")
      au.attributeValues.map(e => e)
      val item = new Item().withInt("age", 1)
      val map: Map[String, AnyRef] = item.toMap
      val set: Set[String] = item.toStringSet("age")
      assert(set.size > 0)
    }
  }
}
