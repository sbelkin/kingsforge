package io.sbelkin.kingsforge.entity.game

import io.sbelkin.kingsforge.entity.{Dice, DiceType}

/**
  * Created by sbelkin on 10/23/2016.
  */
class DiceCount(val total: Int, var current: Int, val dice: DiceType.Value) {

  def this(total: Int, dice: DiceType.Value){
    this(total,total, dice)
  }

  def add(add:Int): Unit ={
    current+=add
  }

  def subtract(sub:Int): Unit ={
    current-=sub
  }

  override def toString(): String = {
    "{type: %s, total: %s, current: %s }".format(dice.toString, total, current)
  }
}