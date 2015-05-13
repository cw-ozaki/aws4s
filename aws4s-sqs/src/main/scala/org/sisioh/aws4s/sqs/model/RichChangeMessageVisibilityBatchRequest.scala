package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest
import org.sisioh.aws4s.PimpedType

class RichChangeMessageVisibilityBatchRequest(val underlying: ChangeMessageVisibilityBatchRequest)
    extends AnyVal with PimpedType[ChangeMessageVisibilityBatchRequest] {

}
