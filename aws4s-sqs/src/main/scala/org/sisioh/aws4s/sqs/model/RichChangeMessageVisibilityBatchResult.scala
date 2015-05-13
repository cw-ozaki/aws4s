package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult
import org.sisioh.aws4s.PimpedType

class RichChangeMessageVisibilityBatchResult(val underlying: ChangeMessageVisibilityBatchResult)
    extends AnyVal with PimpedType[ChangeMessageVisibilityBatchResult] {

}
