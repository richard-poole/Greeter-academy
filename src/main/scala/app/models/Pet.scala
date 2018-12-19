package app.models

sealed trait Pet {
  val name: String

  def speak(): String = "hello"
}

final case class Cat(override val name: String) extends Pet {
 override def speak(): String = name + "says meow"
}

final case class Dog(override val name: String) extends Pet {
  override def speak(): String = name + "says Woof"
}

object Stuff {

  def whoDis(pet: Pet): String = {
    pet match {
      case Dog(name) => s"This is a dog and their name is $name"
      case Cat(name) => s"This is a cat and their name is $name"
    }

  }
//if ever you want to print a line of code - use the below def main method
// 'def main(args: Array[String]) : Unit = {' before the line of code and then println afterwards to print to terminal
  def main(args: Array[String]) : Unit = {

    val d = Dog("Geoff")
    println(whoDis(d))

  }
}
  object Thing {

    def intToString(n: Int): String = {
      n match {
        case 0 => "zero"
        case 1 => "one"
        case 2 => "two"
        case _ => "more than two"
      }
    }

    val number = 0

    def main(args: Array[String]): Unit = {

      println(intToString(number))

    }
  }

