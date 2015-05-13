package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.Listener
import org.sisioh.aws4s.PimpedType

object ListenerFactory {

  def create(): Listener = new Listener()

}

class RichListener(val underlying: Listener)
    extends AnyVal with PimpedType[Listener] {

  def protocol: Option[String] = Option(underlying.getProtocol)

  def protocol_=(value: Option[String]): Unit =
    underlying.setProtocol(value.orNull)

  def withProtocol(value: Option[String]): Listener =
    underlying.withProtocol(value.orNull)

  // ---

  def port: Option[Int] = Option(underlying.getPort)

  def port_=(value: Option[Int]): Unit =
    underlying.setPort(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withPort(value: Option[Int]): Listener =
    underlying.withPort(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

}
