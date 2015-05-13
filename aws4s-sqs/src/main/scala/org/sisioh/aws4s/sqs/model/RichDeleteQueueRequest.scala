package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteQueueRequest
import org.sisioh.aws4s.PimpedType

class RichDeleteQueueRequest(val underlying: DeleteQueueRequest)
    extends AnyVal with PimpedType[DeleteQueueRequest] {

}
