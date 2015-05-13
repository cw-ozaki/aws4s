package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueUrlRequest
import org.sisioh.aws4s.PimpedType

class RichGetQueueUrlRequest(val underlying: GetQueueUrlRequest)
    extends AnyVal with PimpedType[GetQueueUrlRequest] {

}
