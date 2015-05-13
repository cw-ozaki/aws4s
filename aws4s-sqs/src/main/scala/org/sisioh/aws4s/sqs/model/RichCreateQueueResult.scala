package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.CreateQueueResult
import org.sisioh.aws4s.PimpedType

class RichCreateQueueResult(val underlying: CreateQueueResult)
    extends AnyVal with PimpedType[CreateQueueResult] {

}
