package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentResourcesDescription
import org.sisioh.aws4s.PimpedType

class RichEnvironmentResourcesDescription(val underlying: EnvironmentResourcesDescription)
  extends AnyVal with PimpedType[EnvironmentResourcesDescription] {

  def loadBalancerOpt = Option(underlying.getLoadBalancer)


}
