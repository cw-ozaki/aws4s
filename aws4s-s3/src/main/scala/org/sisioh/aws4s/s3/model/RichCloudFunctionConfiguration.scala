package org.sisioh.aws4s.s3.model

import java.util

import com.amazonaws.services.s3.model.{CloudFunctionConfiguration, S3Event}
import org.sisioh.aws4s.PimpedType

object CloudFunctionConfigurationFactory {

  def create(invocationRole: String, function: String, events: Set[S3Event]): CloudFunctionConfiguration =
    new CloudFunctionConfiguration(invocationRole, function, util.EnumSet.of(events.head, events.tail.toArray: _*))

  def create(invocationRole: String, function: String, events: String*): CloudFunctionConfiguration =
    new CloudFunctionConfiguration(invocationRole, function, events: _*)

}

class RichCloudFunctionConfiguration(val underlying: CloudFunctionConfiguration)
  extends AnyVal with PimpedType[CloudFunctionConfiguration] {

  def invocationRoleARN: String = underlying.getInvocationRoleARN

  def cloudFunctionARN: String = underlying.getCloudFunctionARN

}
