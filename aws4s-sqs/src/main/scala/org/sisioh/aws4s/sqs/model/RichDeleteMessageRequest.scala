package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageRequest
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageRequest(val underlying: DeleteMessageRequest)
  extends AnyVal with PimpedType[DeleteMessageRequest] {

}
