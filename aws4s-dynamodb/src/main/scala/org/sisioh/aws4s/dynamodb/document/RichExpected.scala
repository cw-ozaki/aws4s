package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.Expected
import org.sisioh.aws4s.PimpedType

class RichExpected(val underlying: Expected) extends AnyVal with PimpedType[Expected] {}
