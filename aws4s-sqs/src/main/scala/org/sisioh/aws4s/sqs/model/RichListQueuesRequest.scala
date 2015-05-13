package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListQueuesRequest
import org.sisioh.aws4s.PimpedType

class RichListQueuesRequest(val underlying: ListQueuesRequest)
  extends AnyVal with PimpedType[ListQueuesRequest] {

}
