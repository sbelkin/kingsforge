package io.sbelkin.kingsforge.parse

import java.io.File

import scala.io.Source
import io.sbelkin.kingsforge.entity.{CraftCard, CraftCardRequirement, DiceType}

/**
  * Created by sbelkin on 10/13/2016.
  */
object ParseCraftCards {

  def fileExtract(filename: String): Map[Int,CraftCard] = {
    var map: Map[Int,CraftCard] = Map()
    for (line <- Source.fromFile(filename).getLines) {
      val cols = line.split(",").map(_.trim)
      val c: CraftCard = new CraftCard(cols(0).toInt,cols(1),extractCraftCardRequirement(cols))
      println(c.toString)
      map += (c.getCount() -> c)
    }
    map
  }

  def extractCraftCardRequirement(cols: Array[String]) : List[CraftCardRequirement] = {
    var l:List[CraftCardRequirement] = List()
    var i = 2
    do {
      val require = new CraftCardRequirement(cols(i),cols(i+1).toInt);
      l = l:+require
      i=i+2
    } while (i<cols.length)
    l
  }

}
