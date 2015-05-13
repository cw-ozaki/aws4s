package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest
import org.sisioh.aws4s.PimpedType

class RichListDeadLetterSourceQueuesRequest(val underlying: ListDeadLetterSourceQueuesRequest)
    extends AnyVal with PimpedType[ListDeadLetterSourceQueuesRequest] {

}
