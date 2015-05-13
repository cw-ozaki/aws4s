package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResultEntry
import org.sisioh.aws4s.PimpedType

class RichChangeMessageVisibilityBatchResultEntry(val underlying: ChangeMessageVisibilityBatchResultEntry)
  extends AnyVal with PimpedType[ChangeMessageVisibilityBatchResultEntry] {

}
