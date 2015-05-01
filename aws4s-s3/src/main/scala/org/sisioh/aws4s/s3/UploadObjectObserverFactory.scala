package org.sisioh.aws4s.s3

import com.amazonaws.services.s3.UploadObjectObserver

object UploadObjectObserverFactory {

  def create() = new UploadObjectObserver()

}
