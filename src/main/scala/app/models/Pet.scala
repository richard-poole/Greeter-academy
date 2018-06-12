package app.models

sealed trait Pet {
  val name: String
  def speak(): String
}

final class Cat(override val name: String) extends Pet {
  override def speak() : String = name + "says meow"
}
final class Dog (override val name: String) extends Pet {
  override def speak(): String = name + "says Woof"
}
