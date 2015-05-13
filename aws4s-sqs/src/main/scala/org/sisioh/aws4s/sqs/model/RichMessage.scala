package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.Message
import org.sisioh.aws4s.PimpedType

class RichMessage(val underlying: Message)
    extends AnyVal with PimpedType[Message] {

}
