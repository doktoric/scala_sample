package com.acme.doktoric.matcher

/**
 * Created with IntelliJ IDEA.
 * User: Ricsi
 * Date: 2013.07.15.
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
class MatcherSample {
  val friendName="Robert"

  val friend= friendName match{
    case "Mat" => "pepper"
    case "Robert" => "salsa"
    case _ => "huh?"
  }

  println(friend)
}
