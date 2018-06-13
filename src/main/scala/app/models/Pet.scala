package app.models

sealed trait Pet {
  val name: String

  def speak(): String = "hello"
}

final case class Cat(override val name: String) extends Pet {
 override def speak(): String = name + "says meow"
}

final case class Dog(override val name: String) extends Pet {
 // override def speak(): String = name + "says Woof"
}

object Stuff {

  def whoDis(pet: Pet) = {
    pet match {
      case Dog(name) => s"This is a dog and their name is $name"
      case Cat(name) => s"This is a cat and their name is $name"
    }

  }

  def main(args: Array[String]) : Unit = {

    val d = Dog("Geoff")
    println(whoDis(d))

  }


}
