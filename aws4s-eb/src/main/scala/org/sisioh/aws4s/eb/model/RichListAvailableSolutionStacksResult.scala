package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ListAvailableSolutionStacksResult, SolutionStackDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListAvailableSolutionStacksResultFactory {

  def create(): ListAvailableSolutionStacksResult = new ListAvailableSolutionStacksResult()

}

class RichListAvailableSolutionStacksResult(val underlying: ListAvailableSolutionStacksResult)
  extends AnyVal with PimpedType[ListAvailableSolutionStacksResult] {

  def solutionStacks: Seq[String] = underlying.getSolutionStacks.asScala.toVector

  def solutionStacks_=(value: Seq[String]): Unit =
    underlying.setSolutionStacks(value.asJava)

  def withSolutionStacks_=(value: Seq[String]): ListAvailableSolutionStacksResult =
    underlying.withSolutionStacks(value.asJava)

  // ----

  def solutionStackDetails: Seq[SolutionStackDescription] = underlying.getSolutionStackDetails.asScala.toVector

  def solutionStackDetails_=(value: Seq[SolutionStackDescription]): Unit =
    underlying.setSolutionStackDetails(value.asJava)

  def withSolutionStackDetails_=(value: Seq[SolutionStackDescription]): ListAvailableSolutionStacksResult =
    underlying.withSolutionStackDetails(value.asJava)

}
