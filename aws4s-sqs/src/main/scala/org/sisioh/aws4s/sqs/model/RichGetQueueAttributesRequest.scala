package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.GetQueueAttributesRequest
import org.sisioh.aws4s.PimpedType

class RichGetQueueAttributesRequest(val underlying: GetQueueAttributesRequest)
  extends AnyVal with PimpedType[GetQueueAttributesRequest] {

}
