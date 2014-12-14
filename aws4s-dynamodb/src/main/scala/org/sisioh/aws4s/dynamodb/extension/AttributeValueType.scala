package org.sisioh.aws4s.dynamodb.extension

object AttributeValueType extends Enumeration {
  val Null, String, Strings, Number, Numbers, Boolean, ByteBuffer, ByteBuffers, Map, List = Value
}
