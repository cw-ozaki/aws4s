package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueAttributesResult
import org.sisioh.aws4s.PimpedType

class RichGetQueueAttributesResult(val underlying: GetQueueAttributesResult)
    extends AnyVal with PimpedType[GetQueueAttributesResult] {

}
