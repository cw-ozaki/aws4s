package org.sisioh.aws4s.s3.model

import java.io.{ File, InputStream }
import java.util.concurrent.ExecutorService

import com.amazonaws.services.s3.UploadObjectObserver
import com.amazonaws.services.s3.internal.MultiFileOutputStream
import com.amazonaws.services.s3.model.{ ObjectMetadata, UploadObjectRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UploadObjectRequestFactory {

  def create(bucketName: String, key: String, file: File): UploadObjectRequest =
    new UploadObjectRequest(bucketName, key, file)

  def create(bucketName: String, key: String, input: InputStream, metadata: ObjectMetadata): UploadObjectRequest =
    new UploadObjectRequest(bucketName, key, input, metadata)

}

class RichUploadObjectRequest(val underlying: UploadObjectRequest)
    extends AnyVal with PimpedType[UploadObjectRequest] {

  def uploadPartMetadataOpt: Option[ObjectMetadata] = Option(underlying.getUploadPartMetadata)

  def uploadPartMetadataOpt_=(value: Option[ObjectMetadata]): Unit =
    underlying.setUploadPartMetadata(value.orNull)

  def withUploadPartMetadataOpt(value: Option[ObjectMetadata]): UploadObjectRequest =
    underlying.withUploadPartMetadata(value.orNull)

  // ---

  def partSize: Long = underlying.getPartSize

  def witPartSize(value: Long) = underlying.withPartSize(value)

  // ---

  def materialsDescription: Map[String, String] = underlying.getMaterialsDescription.asScala.toMap

  def materialsDescription_=(value: Map[String, String]): Unit =
    underlying.setMaterialsDescription(value.asJava)

  def withMaterialsDescription(value: Map[String, String]): Unit =
    underlying.withMaterialsDescription(value.asJava)

  // ---

  def executorServiceOpt: Option[ExecutorService] = Option(underlying.getExecutorService)

  def withExecutorServiceOpt(value: Option[ExecutorService]): UploadObjectRequest =
    underlying.withExecutorService(value.orNull)

  // ---

  def multiFileOutputStreamOpt: Option[MultiFileOutputStream] = Option(underlying.getMultiFileOutputStream)

  def withMultiFileOutputStreamOpt(value: Option[MultiFileOutputStream]): UploadObjectRequest =
    underlying.withMultiFileOutputStream(value.orNull)

  // ---

  def uploadObjectObserverOpt: Option[UploadObjectObserver] = Option(underlying.getUploadObjectObserver)

  def withUploadObjectObserverOpt(value: Option[UploadObjectObserver]): UploadObjectRequest =
    underlying.withUploadObjectObserver(value.orNull)

  // ---

  def diskLimit: Long = underlying.getDiskLimit

}
