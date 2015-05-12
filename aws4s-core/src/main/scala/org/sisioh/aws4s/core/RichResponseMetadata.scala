package org.sisioh.aws4s.core

import com.amazonaws.ResponseMetadata
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ResponseMetadataFactory {

  def create(metadata: Map[String, String]): ResponseMetadata =
    new ResponseMetadata(metadata.asJava)

  def create(originalResponseMetadata: ResponseMetadata): ResponseMetadata =
    new ResponseMetadata(originalResponseMetadata)

}

class RichResponseMetadata(val underlying: ResponseMetadata)
    extends AnyVal with PimpedType[ResponseMetadata] {

  def requestId: Option[String] = Option(underlying.getRequestId)

}
