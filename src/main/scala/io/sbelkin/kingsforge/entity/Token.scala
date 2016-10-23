package io.sbelkin.kingsforge.entity

/**
  * Created by sbelkin on 10/23/2016.
  */
class Token(val value: TokenType.Value) {
  override def toString(): String = {
    "{type: %s}".format(value.toString)
  }
}

object TokenType extends Enumeration {
  type Type = Value
  val  AUTOMATIC6, PLUS1AND1, CURSE, ANY, NONE = Value
}