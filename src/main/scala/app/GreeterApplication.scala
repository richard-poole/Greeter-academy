package app

import scala.io.StdIn

class Person (name: String) {
  def speak():String = {
    if (name == "Adam") {
      s"You don't get a hello"
    } else {
      s"Hello $name"
    }
  }
}

object GreeterApplication extends App {

  def greet(name: String) : Unit = {
    if (name == "Richard") {
      println(s"Hello $name!!!!!")
    } else {
      println(s"Hello $name but you're not Richard!!!")
    }
  }
  val name = StdIn.readLine("What is your name? ")
  greet(name)

}
