package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.{ ListTopicsResult, Topic }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListTopicsResultFactory {

  def create(): ListTopicsResult =
    new ListTopicsResult()

}

class RichListTopicsResult(val underlying: ListTopicsResult)
    extends AnyVal with PimpedType[ListTopicsResult] {

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): ListTopicsResult =
    underlying.withNextToken(value.orNull)

  def topics: Seq[Topic] =
    underlying.getTopics.asScala.toVector

  def topics_=(value: Seq[Topic]): Unit =
    underlying.setTopics(value.asJava)

  def withTopics(value: Seq[Topic]): ListTopicsResult =
    underlying.withTopics(value.asJava)

}
