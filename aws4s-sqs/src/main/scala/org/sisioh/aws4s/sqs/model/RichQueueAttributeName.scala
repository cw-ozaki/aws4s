package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.QueueAttributeName
import org.sisioh.aws4s.PimpedType

class RichQueueAttributeName(val underlying: QueueAttributeName)
  extends AnyVal with PimpedType[QueueAttributeName] {

}
