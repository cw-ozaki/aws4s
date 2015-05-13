package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry
import org.sisioh.aws4s.PimpedType

class RichChangeMessageVisibilityBatchRequestEntry(val underlying: ChangeMessageVisibilityBatchRequestEntry)
  extends AnyVal with PimpedType[ChangeMessageVisibilityBatchRequestEntry] {

}
