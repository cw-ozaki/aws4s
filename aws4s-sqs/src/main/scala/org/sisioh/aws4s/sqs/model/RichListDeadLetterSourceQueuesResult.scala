package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult
import org.sisioh.aws4s.PimpedType

class RichListDeadLetterSourceQueuesResult(val underlying: ListDeadLetterSourceQueuesResult)
    extends AnyVal with PimpedType[ListDeadLetterSourceQueuesResult] {

}
