package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ListQueuesResult
import org.sisioh.aws4s.PimpedType

class RichListQueuesResult(val underlying: ListQueuesResult)
    extends AnyVal with PimpedType[ListQueuesResult] {

}
