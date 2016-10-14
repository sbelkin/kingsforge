package io.sbelkin.kingsforge.entity

/**
  * Created by sbelkin on 10/13/2016.
  */
class CraftCardRequirement(val dice: Dice,val int:Int) {

  def this(diceType: String,int:Int){
    this(new Dice(DiceType.withName(diceType)),int)
  }

  override def toString: String = {
    "{count:%d , dice: %s}".format(int,dice)
  }
}