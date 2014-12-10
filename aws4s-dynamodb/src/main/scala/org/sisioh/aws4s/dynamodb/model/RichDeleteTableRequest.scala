package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest
import org.sisioh.aws4s.PimpedType

object DeleteTableRequestFactory {

 def apply(): DeleteTableRequest = new DeleteTableRequest()

}

class RichDeleteTableRequest(val underlying: DeleteTableRequest) extends AnyVal with PimpedType[DeleteTableRequest] {

 def tableName_=(value: String): Unit = underlying.setTableName(value)

 def tableName: String = underlying.getTableName



}
