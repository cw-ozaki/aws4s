package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.BatchResultErrorEntry
import org.sisioh.aws4s.PimpedType

class RichBatchResultErrorEntry(val underlying: BatchResultErrorEntry)
    extends AnyVal with PimpedType[BatchResultErrorEntry] {

}
