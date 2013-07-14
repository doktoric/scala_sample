package com.acme.doktoric.iteration

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.07.14.
 * Time: 19:26
 * To change this template use File | Settings | File Templates.
 */
class CollectionSample(sampleList: List[Int]) {

  writeListToConsoleWithFor(sampleList)
  writeListToConsoleWithWhile(sampleList)
  writeListToConsoleWithForEach(sampleList)

  def writeListToConsoleWithFor(x: List[Int]): Unit = {
    println("writeListToConsoleWithFor:")
    for (i <- 0.to(x.length - 1))
      println(x.apply(i))
  }

  def writeListToConsoleWithForEach(x: List[Int]): Unit = {
    println("writeListToConsoleWithForEach:")
    for (i <- x)
      println(i)
    println("or writeListToConsoleWithForEach:")
    x.foreach(println)
  }

  def writeListToConsoleWithWhile(x: List[Int]): Unit = {
    var i = 0
    println("writeListToConsoleWithWhile:")
    while (i < x.length) {
      println(x(i))
      i += 1;
    }
  }

}
