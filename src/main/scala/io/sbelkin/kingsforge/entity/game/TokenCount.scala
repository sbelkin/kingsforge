package io.sbelkin.kingsforge.entity.game

import io.sbelkin.kingsforge.entity.{DiceType, Token, TokenType}

/**
  * Created by sbelkin on 10/23/2016.
  */
class TokenCount(val total: Int, var current: Int, val token: TokenType.Value) {

  def this(total: Int, token: TokenType.Value){
    this(total,total, token)
  }

  def add(add:Int): Unit ={
    current+=add
  }

  def subtract(sub:Int): Unit ={
    current-=sub
  }

  override def toString(): String = {
    "{type: %s, total: %s, current: %s }".format(token.toString, total, current)
  }
}