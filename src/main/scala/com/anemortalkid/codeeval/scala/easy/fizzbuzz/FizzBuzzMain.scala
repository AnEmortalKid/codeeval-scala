package com.anemortalkid.codeeval.scala.easy.fizzbuzz

import scala.io.Source;

/**
 * a fizzbuzz solution in scala for codeeval
 */
object FizzBuzzMain extends App {
    for(line <- Source.fromFile(args(0)).getLines())
    {
      val values = line.split(" ");
      val x = values(0).toInt
      val y = values(1).toInt
      val n = values(2).toInt

      1 to n foreach {
        i => {
          if(i % x == 0)
            print("F")
          if(i % y == 0)
            print("B")
          if(i%x != 0 &&i%y != 0)
            print(i)
           if( i != n)
             print(" ")
        }
      }
      print("\n")
    }
  
}