package org.sisioh.aws4s.core

import com.amazonaws.AmazonWebServiceClient
import org.sisioh.aws4s.PimpedType

class RichAmazonWebServiceClient(val underlying: AmazonWebServiceClient)
extends AnyVal with PimpedType[AmazonWebServiceClient] {

  def signerRegionOverrideOpt: Option[String] = Option(underlying.getSignerRegionOverride)


}
