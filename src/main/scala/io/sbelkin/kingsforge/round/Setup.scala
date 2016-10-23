package io.sbelkin.kingsforge.round

import io.sbelkin.kingsforge.entity.game.{DiceCount, TokenCount}
import io.sbelkin.kingsforge.entity.{Dice, DiceType, Token, TokenType}

/**
  * Created by sbelkin on 10/18/2016.
  */
object Setup {


  def init(): Unit = {
//    var dice: List[Dice] = List(Dice())
//    91 Dice -
//        42 METAL
//        22 WOOD
//        14 GEM
//        10 MAGIC
//        2 LIBRARY
//        1 CEMETERY
//    4 Tokens -
//      2 - Auto6
//      2 - Green +1/+1
//    18 Gather Cards
//    4 Docks

    val metal: DiceCount = new DiceCount(42,DiceType.METAL)
    val wood: DiceCount = new DiceCount(22,DiceType.WOOD)
    val gem: DiceCount = new DiceCount(14,DiceType.GEM)
    val magic: DiceCount = new DiceCount(10,DiceType.MAGIC)
    val library: DiceCount = new DiceCount(2,DiceType.LIBRARY)
    val cemetery: DiceCount = new DiceCount(1,DiceType.CEMETERY)
    val automatic6 : TokenCount = new TokenCount(2,TokenType.AUTOMATIC6)
    val plus1and1 : TokenCount = new TokenCount(2,TokenType.PLUS1AND1)
//    round
  }


}
