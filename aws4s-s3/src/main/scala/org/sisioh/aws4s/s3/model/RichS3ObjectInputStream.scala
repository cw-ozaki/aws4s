package org.sisioh.aws4s.s3.model

import java.io.InputStream

import com.amazonaws.services.s3.model.S3ObjectInputStream
import org.apache.http.client.methods.HttpRequestBase
import org.sisioh.aws4s.PimpedType

object S3ObjectInputStreamFactory {

  def create(in: InputStream, httpRequest: HttpRequestBase): S3ObjectInputStream =
    new S3ObjectInputStream(in, httpRequest)

  def create(in: InputStream, httpRequest: HttpRequestBase, collectMetrics: Boolean): S3ObjectInputStream =
    new S3ObjectInputStream(in, httpRequest, collectMetrics)

}

class RichS3ObjectInputStream(val underlying: S3ObjectInputStream)
    extends AnyVal with PimpedType[S3ObjectInputStream] {

  def httpRequest = underlying.getHttpRequest

}
