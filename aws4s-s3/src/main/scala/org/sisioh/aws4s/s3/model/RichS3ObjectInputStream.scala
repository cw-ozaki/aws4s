package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.S3ObjectInputStream
import org.sisioh.aws4s.PimpedType

class RichS3ObjectInputStream(val underlying: S3ObjectInputStream)
  extends AnyVal with PimpedType[S3ObjectInputStream] {

  def httpRequest = underlying.getHttpRequest

}
