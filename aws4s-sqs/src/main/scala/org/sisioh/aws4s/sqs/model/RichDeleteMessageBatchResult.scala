package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageBatchResult
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageBatchResult(val underlying: DeleteMessageBatchResult)
    extends AnyVal with PimpedType[DeleteMessageBatchResult] {

}
