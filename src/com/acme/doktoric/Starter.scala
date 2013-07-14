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
    var sampleList= List(1,2,3)
    writeListToConsoleWithFor(sampleList)
    writeListToConsoleWithWhile(sampleList)
    writeListToConsoleWithForEach(sampleList)

  }

  def writeListToConsoleWithFor(x: List[Int]):Unit = {
    println("writeListToConsoleWithFor:")
    for (i<- 0.to(x.length-1))
      println(x.apply(i))
  }

  def writeListToConsoleWithForEach(x: List[Int]):Unit = {
    println("writeListToConsoleWithForEach:")
    for (i<-x)
      println(i)
    println("or writeListToConsoleWithForEach:")
    x.foreach(println)
  }

  def writeListToConsoleWithWhile(x: List[Int]):Unit = {
    var i=0
    println("writeListToConsoleWithWhile:")
    while ( i< x.length) {
      println(x(i))
      i+=1;
    }
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
}