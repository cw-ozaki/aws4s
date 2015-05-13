package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueUrlResult
import org.sisioh.aws4s.PimpedType

class RichGetQueueUrlResult(val underlying: GetQueueUrlResult)
    extends AnyVal with PimpedType[GetQueueUrlResult] {

}
