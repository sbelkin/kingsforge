package io.sbelkin.kingsforge.entity

/**
  * Created by sbelkin on 10/13/2016.
  */
class Dice(val value: DiceType.Value) {
  override def toString(): String = {
    "{type: %s}".format(value.toString)
  }
}

object DiceType extends Enumeration {
  type Type = Value
  val METAL, WOOD, GEM, MAGIC, LIBRARY, CEMETERY = Value
}
