package com.anemortalkid.codeeval.scala.easy.sumofprimes

import scala.annotation.tailrec

object SOPTom extends App {

  def isPrime(n: Int) = !(2 to (n / 2)).exists(x => n % x == 0)

  def firstNPrimes(numPrimes: Int): List[Int] = {
    def nextPrime(n: Int) = (n + 1 to n * n).find(isPrime).get
    @tailrec def appendNextPrime(n: Int, primes: List[Int]): List[Int] = {
      if (primes.size >= numPrimes) {
        primes
      } else {
        val p = nextPrime(n)
        appendNextPrime(p, primes :+ p)
      }
    }
    appendNextPrime(2, List(2))
  }
  print(firstNPrimes(1000).sum)

}