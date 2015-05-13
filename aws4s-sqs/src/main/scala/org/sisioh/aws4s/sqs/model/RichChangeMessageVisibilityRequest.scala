package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest
import org.sisioh.aws4s.PimpedType

class RichChangeMessageVisibilityRequest(val underlying: ChangeMessageVisibilityRequest)
  extends AnyVal with PimpedType[ChangeMessageVisibilityRequest] {

}
