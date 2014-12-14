package org.sisioh.aws4s.dynamodb.extension

import java.util.Date

case class ProvisionedThroughputEx(lastIncreaseDateTime: Date,
                                   lastDecreaseDateTime: Date,
                                   numberOfDecreasesToday: Long,
                                   readCapacityUnits: Long,
                                   writeCapacityUnits: Long)
