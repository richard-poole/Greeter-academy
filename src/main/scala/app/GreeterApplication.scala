package app

import scala.io.StdIn

object GreeterApplication extends App {

  def greet(name: String) : Unit = {
    if (name == "Richard") {
      println(s"Hello $name! you sexy son of a gun!!!!")
    } else {
      println(s"Hello $name")
    }
  }
  val name = StdIn.readLine("What is your name? ")
  greet(name)

}
