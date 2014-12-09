package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest
import com.github.j5ik2o.aws.PimpedType

object DeleteTableRequestFactory {

 def apply(): DeleteTableRequest = new DeleteTableRequest()

}

class RichDeleteTableRequest(val underlying: DeleteTableRequest) extends AnyVal with PimpedType[DeleteTableRequest] {

 def tableName_=(value: String): Unit = underlying.setTableName(value)

 def tableName: String = underlying.getTableName



}
