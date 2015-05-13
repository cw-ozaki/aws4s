package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.PurgeQueueRequest
import org.sisioh.aws4s.PimpedType

class RichPurgeQueueRequest(val underlying: PurgeQueueRequest)
    extends AnyVal with PimpedType[PurgeQueueRequest] {

}
