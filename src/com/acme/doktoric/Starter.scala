package com.acme.doktoric

import classes.{SpecificDog, LittleDog, BigDog}
import iteration.CollectionSample
import matcher.MatcherSample
import special.ClassFunctionSample

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
    var collectionSample=new CollectionSample(List(1,2,3))
    val dog = new BigDog()
    dog.sayWuf()
    val littleDog=new LittleDog()
    littleDog.sayWuf()
    println(littleDog)
    littleDog.+(3)
    val specificDog=new SpecificDog()
    specificDog.sayWuf()
    println(specificDog)

    val matcherSample=new MatcherSample()
    val classFunctionSample=new ClassFunctionSample()
    println(classFunctionSample.increase(10))
    println(classFunctionSample.writeNumbersToConsole(List(1,2,3)))
    println(classFunctionSample.increaseWithPrint(1))

  }



  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
}