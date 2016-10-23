package io.sbelkin.kingsforge

import io.sbelkin.kingsforge.entity._
import io.sbelkin.kingsforge.entity.craft.{CraftCard, CraftCardRequirement}

/**
  * Created by sbelkin on 10/13/2016.
  */
object Example2 extends App {
  val d: Dice = new Dice(10,DiceType.WOOD)
  println(d.toString)

  val cr: CraftCardRequirement = new CraftCardRequirement(DiceType.WOOD,2);
  val cr2: CraftCardRequirement = new CraftCardRequirement(DiceType.WOOD,3);
  val l =  List(cr,cr2)
  val c: CraftCard = new CraftCard(1,"basic",l)

  println(c.toString)
}
