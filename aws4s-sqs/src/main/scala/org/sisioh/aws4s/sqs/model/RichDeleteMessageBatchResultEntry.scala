package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageBatchResultEntry
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageBatchResultEntry(val underlying: DeleteMessageBatchResultEntry)
    extends AnyVal with PimpedType[DeleteMessageBatchResultEntry] {

}
