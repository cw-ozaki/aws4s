package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageBatchRequest
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageBatchRequest(val underlying: DeleteMessageBatchRequest)
    extends AnyVal with PimpedType[DeleteMessageBatchRequest] {

}
