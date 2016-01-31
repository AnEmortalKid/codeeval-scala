package com.anemortalkid.codeeval.scala.easy.reversewords

import scala.io.Source

object ReverseWords extends App {
  print(Source.fromFile(args(0)).getLines().map { x => x.split(" ").reverse.mkString(" ")}.mkString("\n"))
}