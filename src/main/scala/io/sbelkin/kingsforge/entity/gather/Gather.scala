package io.sbelkin.kingsforge.entity.gather

/**
  * Created by sbelkin on 10/23/2016.
  */
trait Gather {
  def getName(): String
  def getType(): GatherType.Value
}
