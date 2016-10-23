package io.sbelkin.kingsforge.entity.gather.pass

import io.sbelkin.kingsforge.entity.gather.{Gather, GatherType}
import io.sbelkin.kingsforge.entity.{Dice, DiceType, Token, TokenType}

/**
  * Created by sbelkin on 10/23/2016.
  */
class Pass(first: Boolean ) extends Gather{

  override def getName(): String = getType().toString
  override def getType(): GatherType.Value = GatherType.PASS

  var firstPass: Boolean = first

  def choice() : Tuple2[Token,Dice] ={
    val dice: Dice = new Dice(DiceType.METAL)
    val token: Token = new Token(TokenType.PLUS1AND1)
    (token,dice)
  }
}
