package io.sbelkin.kingsforge.entity

/**
  * Created by sbelkin on 10/13/2016.
  */
class Player(order: Int, name:String, dices: List[Dice], craftCards:List[CraftCard]) {

  def this(order: Int, name:String, dices: List[Dice]){
    this(order, name, dices, List[CraftCard])
  }
}
