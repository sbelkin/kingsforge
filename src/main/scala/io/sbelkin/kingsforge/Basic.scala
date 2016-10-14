package io.sbelkin.kingsforge

import java.io.File

import io.sbelkin.kingsforge.entity.{CraftCard, CraftCardRequirement, Dice, DiceType}
import io.sbelkin.kingsforge.entity.DiceType._
import io.sbelkin.kingsforge.parse.ParseCraftCards

/**
  * Created by sbelkin on 10/13/2016.
  */
object Basic extends App{
  val fileName: String = "craft_cards.csv"
  val map: Map[Int,CraftCard] = ParseCraftCards.fileExtract(fileName)
  println(map.formatted("\n"))
}