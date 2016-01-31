package main.scala.com.anemortalkid.codeeval.scala.easy.primepalindrome

import scala.collection.mutable.ListBuffer

object PrimePalindromeMain extends App {

  def getPrimes(max: Int): List[Int] = {
    val primes = new ListBuffer[Int]()
    for (i <- 2 to max) {
      if (isPrime(i)) {
        primes += i
      }
    }

    return primes.toList
  }

  /**
   * determines whether the given value is prime or not
   */
  def isPrime(n: Int): Boolean =
    {
      for (i <- 2 to n + 1) {
        if (n % i == 0 && i != n)
          return false
      }

      true
    }

  def reverseInt(n: Int): Int =
    {
      var reversed = 0;
      var input = n;
      while (input != 0) {
        reversed = reversed * 10 + input % 10;
        input = input / 10;
      }
      return reversed;
    }

  val ans = getPrimes(1000).reverse.find { x => x == reverseInt(x) }.head;
  print(ans)
}