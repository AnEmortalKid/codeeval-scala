package main.scala.com.anemortalkid.codeeval.scala.easy.multiples

import scala.io.Source

/**
 * Prints the smallest multiple of n that is greater than or equal to c
 */
object MultiplesMain extends App {

  Source.fromFile(args(0)).getLines().map { x =>
    val arr = x.split(",", 2)
    val c = arr.head.toInt
    val n = arr.tail.head.toInt
    List.range(0, n * c, n).find { _ >= c }.get
  }.foreach { println }
}