package io.sbelkin.kingsforge

import io.sbelkin.kingsforge.entity.{CraftCard, CraftCardRequirement, Dice, DiceType}

/**
  * Created by sbelkin on 10/13/2016.
  */
object Example2 extends App {
  val d: Dice = new Dice(DiceType.WOOD);
  println(d.toString)

  val cr: CraftCardRequirement = new CraftCardRequirement(d,2);
  val cr2: CraftCardRequirement = new CraftCardRequirement(d,3);
  val l =  List(cr,cr2)
  val c: CraftCard = new CraftCard(1,"basic",l)

  println(c.toString)
}
