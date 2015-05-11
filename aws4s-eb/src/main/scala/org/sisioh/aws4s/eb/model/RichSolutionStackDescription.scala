package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.SolutionStackDescription
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichSolutionStackDescription(val underlying: SolutionStackDescription)
  extends AnyVal with PimpedType[SolutionStackDescription] {

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): SolutionStackDescription =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def permittedFileTypes: Seq[String] = underlying.getPermittedFileTypes.asScala

  def permittedFileTypes_=(value: Seq[String]): Unit =
    underlying.withPermittedFileTypes(value.asJava)

  def withPermittedFileTypes(value: Seq[String]): SolutionStackDescription =
    underlying.withPermittedFileTypes(value.asJava)

}
