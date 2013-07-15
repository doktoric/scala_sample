package com.acme.doktoric.classes

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.07.14.
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 */
abstract class AbstractDog {
  val message: String
  def sayWuf() = println(message)
  override def toString="Adog: "+message

  def +(number: Int):Unit={
    println("the dogs were increased: "+number+" count and say:"+message)
  }
}
