package io.sbelkin.kingsforge.entity.craft

import io.sbelkin.kingsforge.entity.DiceType

/**
  * Created by sbelkin on 10/23/2016.
  */
class CraftCard(count:Int, name:String, requirements: List[CraftCardRequirement]) {

  def getCount(): Int ={
    count
  }

  override def toString: String = {
    "{count:%s, name:%s, requirements:[%s]}".format(count,name,requirements.mkString(","))
  }
}