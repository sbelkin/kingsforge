package io.sbelkin.kingsforge.entity.gather.dock

import io.sbelkin.kingsforge.entity.{Dice, DiceType, Token, TokenType}
import io.sbelkin.kingsforge.entity.gather.{Gather, GatherType}

/**
  * Created by sbelkin on 10/23/2016.
  */
trait DockAction {
//  Hard coding the dock actions as they are limit and un changing. Can be latter extend out to be parsed in.
  def dockType: Either[DiceType.Value, TokenType.Value]
  def exchange1Requirement() : Int
  def exchange2Requirement() : Int
  def exchange(dice: List[Dice]) : Either[Dice, Token]
}
