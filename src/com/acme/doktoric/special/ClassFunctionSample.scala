package com.acme.doktoric.special

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.07.15.
 * Time: 22:14
 * To change this template use File | Settings | File Templates.
 */
class ClassFunctionSample {
  var increase = (x: Int) => x + 1
  var writeNumbersToConsole=(x:List[Int])=>{
    x.foreach(println _)
  }
  var increaseWithPrint = (x: Int) => {
    println("Now we will increase the: " + x)
    println("After the increase: " + (x + 1))
  }

  def curriedSum(x: Int)(y: Int) = x + y

}
