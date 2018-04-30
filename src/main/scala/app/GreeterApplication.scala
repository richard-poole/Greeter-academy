package app

import scala.io.StdIn

object Prompt {
  def ask(message: String) = StdIn.readLine(message)
}


class Person(name: String, age: Int) {
  private val years: String = if (age > 1) "years" else "year"

  def speak(): String = {
    if (name == "Adam") {
      s"You don't get a hello"
    } else {
      s"Hello $name, you are $age $years old"
    }
  }
}

object GreeterApplication extends App {
  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")
  val person = new Person(name, age.toInt)
  println(person.speak())


}
