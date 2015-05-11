package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.OptionRestrictionRegex
import org.sisioh.aws4s.PimpedType

class RichOptionRestrictionRegex(val underlying: OptionRestrictionRegex)
  extends AnyVal with PimpedType[OptionRestrictionRegex] {

  def patternOpt: Option[String] = Option(underlying.getPattern)

  def patternOpt_=(value: Option[String]): Unit =
    underlying.setPattern(value.orNull)

  def withPatternOpt(value: Option[String]): OptionRestrictionRegex =
    underlying.withPattern(value.orNull)

  // ---

  def labelOpt: Option[String] = Option(underlying.getLabel)

  def labelOpt_=(value: Option[String]): Unit =
    underlying.setLabel(value.orNull)

  def withLabelOpt(value: Option[String]): OptionRestrictionRegex =
    underlying.withLabel(value.orNull)

}
