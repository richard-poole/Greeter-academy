package app

import app.models.{CashISAAccount, Person}
import app.views.Prompt

import scala.io.StdIn




object GreeterApplication extends App {
  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")
  val cashisa = new CashISAAccount("45858", 0.0, 1000)
  val deposited = cashisa.deposit(1000)
  val withdrawn = deposited.withdraw(200)
  val normalAccount = new CashISAAccount("25258", 100)
  val loyalAccountDeposited = normalAccount.deposit(300)


  val person = new Person(name, age.toInt, withdrawn)
  println(person.speak())

  val loyal = new Person("Loyal Customer", 22, loyalAccountDeposited)
  Prompt.reply(loyal.speak())


}








