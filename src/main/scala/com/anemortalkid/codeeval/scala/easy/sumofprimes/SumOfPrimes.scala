package com.anemortalkid.codeeval.scala.easy.sumofprimes

import scala.collection.mutable.ListBuffer

object SumOfPrimes extends App {

  def isPrime(n: Int) = !(2 to (n / 2)).exists(x => n % x == 0)
  def getNPrimes(n: Int): List[Int] =
    {
      var count: Int = 0
      var num: Int = 2
      val list: ListBuffer[Int] = new ListBuffer[Int]

      while (count != n) {
        if (isPrime(num)) {
          list.append(num)
          count = count + 1
        }
        num = num + 1
      }

      return list.toList
    }
  
  print(getNPrimes(1000).sum)
}