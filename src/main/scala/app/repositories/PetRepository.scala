package app.repositories

import scala.collection.mutable.ArrayBuffer

sealed trait Pet {
  val name: String

  def speak(): String = "hello"
}

object PetRepository {

  val c1 = Cat("Tom")
  val c2 = Dog("Spot")
  val c3 = Cat("Felix")

  c1 == c3

  println(c1.name)

  case class Cat (name: String) extends Pet {
    override def speak(): String = name + "says Meow!!"
  }
//
//  case class Dog (name: String) extends Pet {
//    override def speak(): String = name + "says Woof!!"
//  }

  class Dog (name: String, private val personYears: Int) {
    import Dog._
    def age = calculateAgeInDogYears(personYears)

  }
  object Dog {
    def withName(name:String) = new Dog(name, 2)
    def apply (name: String, age: Int =1) = new Dog(name, age)
    private def calculateAgeInDogYears(age: Int) = age * 7
  }

  val d = Dog("Bruce", 3)




  private	val	_pets	:	ArrayBuffer[Pet]	=	new	ArrayBuffer[Pet]()

  def all() : List[Pet] = _pets.toList

  def findByName(name : String) : Option[Pet] = None

  def dogs : List[Pet] =  _pets.toList

  def cats : List[Pet] =  _pets.toList

  def other : List[Pet] = _pets.toList

  def add(pet: Pet*) : List[Pet] = _pets.toList

  def removeByName(name : String) : List[Pet] = _pets.toList

  def update(pet : Pet) : List[Pet] = _pets.toList

}

