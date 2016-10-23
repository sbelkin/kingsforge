
package io.sbelkin.kingsforge.entity.gather.dock

import io.sbelkin.kingsforge.entity.gather.{Gather, GatherType}
import io.sbelkin.kingsforge.entity.{Dice, DiceType, Token, TokenType}

/**
  * Created by sbelkin on 10/23/2016.
  */
class TokenDock extends Gather with DockAction {

  override def getName(): String = getType()+dockType.toString
  override def getType(): GatherType.Value = GatherType.DOCK
  override def dockType: Either[DiceType.Value, TokenType.Value] = Right(TokenType.AUTOMATIC6)

  override def exchange1Requirement(): Int = {
    2
  }

  override def exchange2Requirement(): Int = {
    3
  }

  override def exchange(dice: List[Dice]): Either[Dice, Token] = {
    Right(new Token(TokenType.AUTOMATIC6))
  }
}
