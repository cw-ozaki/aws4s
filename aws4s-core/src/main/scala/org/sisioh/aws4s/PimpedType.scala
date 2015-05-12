package org.sisioh.aws4s

trait PimpedType[T] extends Any {

  def underlying: T

}
