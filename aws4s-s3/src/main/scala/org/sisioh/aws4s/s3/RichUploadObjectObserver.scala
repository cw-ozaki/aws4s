package org.sisioh.aws4s.s3

import java.util.concurrent.Future

import com.amazonaws.services.s3.UploadObjectObserver
import com.amazonaws.services.s3.model.UploadPartResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichUploadObjectObserver(val underlying: UploadObjectObserver) extends AnyVal with PimpedType[UploadObjectObserver] {

  def futures: Seq[Future[UploadPartResult]] = underlying.getFutures.asScala

}
