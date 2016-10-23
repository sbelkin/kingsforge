package io.sbelkin.kingsforge.entity.craft

import io.sbelkin.kingsforge.entity.DiceType

/**
  * Created by sbelkin on 10/23/2016.
  */
class CraftCardRequirement(val diceType: DiceType.Type ,val int:Int) {

  def this(diceType: String,int:Int){
    this(DiceType.withName(diceType),int)
  }

  override def toString: String = {
    "{count:%d , dice: %s}".format(int,diceType)
  }
}