package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest
import org.sisioh.aws4s.PimpedType

object DeleteTableRequestFactory {

 def create(): DeleteTableRequest = new DeleteTableRequest()

}

class RichDeleteTableRequest(val underlying: DeleteTableRequest) extends AnyVal with PimpedType[DeleteTableRequest] {

 // ---

 def tableNameOpt: Option[String] = Option(underlying.getTableName)

 def tableNameOpt_=(value: Option[String]): Unit = underlying.setTableName(value.orNull)

 def withTableNameOpt(value: Option[String]): DeleteTableRequest = underlying.withTableName(value.orNull)

 // ---

}
