package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams
import org.sisioh.aws4s.PimpedType

class RichSSEAwsKeyManagementParams(val underlying: SSEAwsKeyManagementParams)
  extends AnyVal with PimpedType[SSEAwsKeyManagementParams] {

  def awsKmsKeyIdOpt = Option(underlying.getAwsKmsKeyId)

  def encryption = underlying.getEncryption

}
