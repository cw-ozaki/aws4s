package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sqs.model.AddPermissionRequest
import org.sisioh.aws4s.PimpedType
import scala.collection.JavaConversions._

object AddPermissionRequestFactory {

  def create(): AddPermissionRequest = new AddPermissionRequest()

  def create(queueUrl: String, label: String, awsAccountIds: Seq[String], actions: Seq[String]): AddPermissionRequest =
    new AddPermissionRequest(queueUrl, label, awsAccountIds, actions)
}

class RichAddPermissionRequest(val underlying: AddPermissionRequest)
    extends AnyVal with PimpedType[AddPermissionRequest] {

  def queueUrlOpt: Option[String] =
    Option(underlying.getQueueUrl)

  def withQueueUrl(queueUrl: Option[String]): AddPermissionRequest =
    underlying.withQueueUrl(queueUrl.orNull)

  def labelOpt: Option[String] =
    Option(underlying.getLabel)

  def withLabel(label: Option[String]): AddPermissionRequest =
    underlying.withLabel(label.orNull)

  def awsAccountIds: Seq[String] =
    underlying.getAWSAccountIds

  def withAWSAccountIds(awsAccountIds: Seq[String]) =
    underlying.withAWSAccountIds(awsAccountIds)

  def actions: Seq[String] =
    underlying.getActions

  def withActions(actions: Seq[String]) =
    underlying.withActions(actions)

}
