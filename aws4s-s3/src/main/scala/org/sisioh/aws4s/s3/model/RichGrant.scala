package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{Grant, Grantee, Permission}
import org.sisioh.aws4s.PimpedType

object GrantFactory {

  def create(grantee: Grantee, permission: Permission): Grant =
    new Grant(grantee, permission)

}


class RichGrant(val underlying: Grant)
  extends AnyVal with PimpedType[Grant] {

  def grantee = underlying.getGrantee

  def permission = underlying.getPermission

}
