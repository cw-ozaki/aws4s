package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.CreateQueueRequest
import org.sisioh.aws4s.PimpedType

class RichCreateQueueRequest(val underlying: CreateQueueRequest)
  extends AnyVal with PimpedType[CreateQueueRequest] {

}
