package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest
import org.sisioh.aws4s.PimpedType

object DeleteTableRequestFactory {

 def create(): DeleteTableRequest = new DeleteTableRequest()

}

class RichDeleteTableRequest(val underlying: DeleteTableRequest) extends AnyVal with PimpedType[DeleteTableRequest] {

 def tableNameOpt_=(value: String): Unit = underlying.setTableName(value)

 def tableNameOpt: Option[String] = Option(underlying.getTableName)

}
