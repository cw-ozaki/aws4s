package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{EnvironmentInfoDescription, RetrieveEnvironmentInfoResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object RetrieveEnvironmentInfoResultFactory {

  def create(): RetrieveEnvironmentInfoResult = new RetrieveEnvironmentInfoResult()

}

class RichRetrieveEnvironmentInfoResult(val underlying: RetrieveEnvironmentInfoResult)
    extends AnyVal with PimpedType[RetrieveEnvironmentInfoResult] {

  def environmentInfoOpt: Seq[EnvironmentInfoDescription] = underlying.getEnvironmentInfo.asScala

  def environmentInfoOpt_=(value: Seq[EnvironmentInfoDescription]): Unit =
    underlying.setEnvironmentInfo(value.asJava)

  def withEnvironmentInfoOpt(value: Seq[EnvironmentInfoDescription]): RetrieveEnvironmentInfoResult =
    underlying.withEnvironmentInfo(value.asJava)
}
