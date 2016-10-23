package io.sbelkin.kingsforge.entity.gather.dock

import io.sbelkin.kingsforge.entity.{Dice, DiceType, Token, TokenType}
import io.sbelkin.kingsforge.entity.gather.{Gather, GatherType}

/**
  * Created by sbelkin on 10/23/2016.
  */
class WoodDock extends Gather with DockAction {

  override def getName(): String = getType()+dockType.toString
  override def getType(): GatherType.Value = GatherType.DOCK
  override def dockType: Either[DiceType.Value, TokenType.Value] = Left(DiceType.WOOD)


  override def exchange1Requirement(): Int = {
    1
  }

  override def exchange2Requirement(): Int = {
    2
  }
  
  override def exchange(dice: List[Dice]): Either[Dice, Token] = {
    Left(new Dice(DiceType.WOOD))
  }
}
