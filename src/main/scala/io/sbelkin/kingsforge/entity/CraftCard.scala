package io.sbelkin.kingsforge.entity

/**
  * Created by sbelkin on 10/13/2016.
  */
class CraftCard(count:Int, name:String, requirements: List[CraftCardRequirement]) {

  def getCount(): Int ={
    count
  }

  override def toString: String = {
    "{count:%s, name:%s, requirements:[%s]}".format(count,name,requirements.mkString(","))
  }
}