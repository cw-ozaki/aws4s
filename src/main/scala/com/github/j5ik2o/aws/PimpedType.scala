package com.github.j5ik2o.aws

trait PimpedType[T] extends Any{

  def underlying: T

}
