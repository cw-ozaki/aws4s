package org.sisioh.aws4s.eb

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClient

object Implicits extends Implicits

trait Implicits extends AWSElasticBeanstalk

trait AWSElasticBeanstalk {

  implicit def richAWSElasticBeanstalkClient(underlying: AWSElasticBeanstalkClient): RichAWSElasticBeanstalkClient =
    new RichAWSElasticBeanstalkClient(underlying)

}



