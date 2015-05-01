package org.sisioh.aws4s.s3

import com.amazonaws.ResponseMetadata
import com.amazonaws.services.s3.S3ResponseMetadata
import scala.collection.JavaConverters._

object S3ResponseMetadataFactory {

  def create(metadata: Map[String, String]) = new S3ResponseMetadata(metadata.asJava)

  def create(originalResponseMetadata: ResponseMetadata) = new S3ResponseMetadata(originalResponseMetadata)

}
