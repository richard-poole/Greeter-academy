package app

import app.models.{CashISASavingsAccount, Person}
import app.views.Prompt

import scala.io.StdIn

object GreeterApplication extends App {
  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")
  val cashisa = new CashISASavingsAccount("45858", 0.0, 1000.00)
  val deposited = cashisa.deposit(1000.00)
  val withdrawn = deposited.withdraw(200.00)
  val normalAccount = new CashISASavingsAccount("25258", 100.00)
  val loyalAccountDeposited = normalAccount.deposit(300.00)
  //
  //  val person = new Person(name, age.toInt, LinearSeq(withdrawn))
  //  println(person.speak())
  //
  //  val loyal = new Person("Loyal Customer", 22, Seq(loyalAccountDeposited))
  //  Prompt.reply(loyal.speak())
  //
  //  val nameset = Set("adam", "daniel", "jake", "adam")
  //  println(nameset)

  val person = new Person(name, age.toInt, withdrawn)
  println(person.speak())

  val loyal = new Person("Loyal Customer", 22, loyalAccountDeposited)
  Prompt.reply(loyal.speak())

//  val loyal = new Person("Loyal Customer", 22, loyalAccountDeposited)
//  println(loyal.speak())
}

//object Prompt {
//  def ask(message: String) = StdIn.readLine(message)
//
//  def reply(message: String) = println(message)
//}

//class Person(name: String, age: Int, private val bankAccount: BankAccount) {
//
//  def this(name: String, age: Int) = this (name, age, new SavingsAccount("12345", 0.00))
//
//  def speak(): String = {
//    if (name == "Billy") {
//      s"You dont get a hello!"
//    } else {
//      s"Hello $name, you are $age $years old. \n" +
//        s"Your account details are: $bankAccount"
//    }
//  }
//
//  private val years: String = if (age > 1) "years" else "year"
//}

//abstract class BankAccount(accountNumber:String, val balance:Double) {
//  override def toString: String = s"Account number: $accountNumber, balance: $balance"
//  def withdraw(amount:Double):BankAccount
//  def deposit(amount:Double):BankAccount
//}

//final class SavingsAccount(accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance) {
//  override def withdraw(amount: Double): BankAccount = {
//    if ((balance - amount) < 0){
//      println(s"You have insufficient funds")
//      this
//    } else {
//      val deducted = balance - amount
//      println(s"Balance after deductions: $deducted")
//      new SavingsAccount(accountNumber, deducted)
//    }
//  }
//  override def deposit(amount: Double): BankAccount = {
//    new SavingsAccount(accountNumber, balance + amount)
//  }
//}
//
//final class CashISASavingsAccount(
//                                   accountNumber: String,
//                                   balance: Double,
//                                   private val depositThreshold: Double = 200.00) extends
//  BankAccount(accountNumber, balance) {
//  override def withdraw(amount: Double): BankAccount = {
//    println(s"You cannot withdraw from a Cash ISA")
//    this
//  }
//
//  override def deposit(amount: Double): BankAccount = {
//    if (amount > depositThreshold) {
//      val difference = amount - depositThreshold
//      println(s"You can't deposit more than £$depositThreshold. Excess: £$difference.")
//
//      new CashISASavingsAccount(accountNumber, balance + depositThreshold)
//    } else {
//      new CashISASavingsAccount(accountNumber, balance + amount)
//    }
//  }
//}







