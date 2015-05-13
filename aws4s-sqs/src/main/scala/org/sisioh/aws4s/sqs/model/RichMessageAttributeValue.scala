package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.MessageAttributeValue
import org.sisioh.aws4s.PimpedType

class RichMessageAttributeValue(val underlying: MessageAttributeValue)
    extends AnyVal with PimpedType[MessageAttributeValue] {

}
