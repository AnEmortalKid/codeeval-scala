package com.anemortalkid.codeeval.scala.easy.primepalindrome

/**
 * a proer version of the primes thing
 */
object PPTom extends App {

  val reverse: (Int => Int) = _.toString.reverse.toInt
  def isPalindrome(i: Int) = i == reverse(i)
  def isPrime(p: Int) = !(2 to p / 2).exists(x => (p % x) == 0)
  (11 to 1000)
    .filter(isPalindrome)
    .filter(isPrime)
}