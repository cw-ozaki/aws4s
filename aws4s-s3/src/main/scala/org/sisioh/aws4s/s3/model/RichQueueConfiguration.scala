package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.QueueConfiguration
import org.sisioh.aws4s.PimpedType

class RichQueueConfiguration(val underlying: QueueConfiguration)
  extends AnyVal with PimpedType[QueueConfiguration] {

  def queueARN: String = underlying.getQueueARN

}
