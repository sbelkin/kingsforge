package io.sbelkin.kingsforge.entity.gather.card

import io.sbelkin.kingsforge.entity.Dice
import io.sbelkin.kingsforge.entity.gather.{Gather, GatherType}

/**
  * Created by sbelkin on 10/23/2016.
  */
class GatherCard(name : String, top: String, bottom: String) extends Gather {
  var n: String = name;
  var textTop: String = top;
  var textBottom: String = bottom;

  override def getName(): String = n
  override def getType(): GatherType.Value = GatherType.CARD

  def getTop(): String = {
    top
  }
  def useTop(dices: List[Dice]) : String = {
//    parse text?
    ""
  }

  def getBottom(): String = {
    bottom
  }
  def useBottom(dices: List[Dice]) : String = {
//    parse text?
    ""
  }
}
class GatherCardInput()
