package com.acme.doktoric

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.07.03.
 * Time: 21:01
 * To change this template use File | Settings | File Templates.
 */
object main {
  def main(args: Array[String]) {
    val msg = "Hello world"
    println(msg)
    println(max(3,6))
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
}