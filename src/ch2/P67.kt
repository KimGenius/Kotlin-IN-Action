package ch2

fun main(args: Array<String>) {
  val name = "GeniusK"
  println("Hello $name")
//  Hello GeniusK
  val arrName = arrayListOf("Genie", "Genius", "KimGenius", "GeniusK")
  println("Hello $arrName[0]")
//  Hello [Genie, Genius, KimGenius, GeniusK][0]
  println("Hello ${arrName[0]}")
//  Hello Genie
  val koName = "김영재"
  println("Hello $koName 입니다.")
//  Hello 김영재 입니다.
  println("\$koName")
//  $koName
  println("Hello ${if (true) "Genius" else "Kim"}")
//  Hello Genius
}