package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.SSECustomerKey
import org.sisioh.aws4s.PimpedType

class RichSSECustomerKey(val underlying: SSECustomerKey)
  extends AnyVal with PimpedType[SSECustomerKey] {

  def key = underlying.getKey

  // ---

  def algorithm = underlying.getAlgorithm

  def algorithm_=(value: String): Unit =
    underlying.setAlgorithm(value)

  def withAlgorithm(value: String): SSECustomerKey =
    underlying.withAlgorithm(value)

  // ---

  def md5Opt = Option(underlying.getMd5)

  def md5Opt_=(value: Option[String]): Unit =
    underlying.setMd5(value.orNull)

  def withMD5Opt(value: Option[String]): SSECustomerKey =
    underlying.withMd5(value.orNull)

}
