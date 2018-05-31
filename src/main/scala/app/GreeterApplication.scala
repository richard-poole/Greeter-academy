package app

import java.time.temporal.TemporalAmount

import scala.io.StdIn

object Prompt {
  def ask(message: String) = StdIn.readLine(message)
}


class Person(name: String, age: Int, private val bankAccount: BankAccount) {

  def this (name: String, age: Int) = this(name, age, new SavingsAccount("12345", 0.00))

  private val years: String = if (age > 1) "years" else "year"

  def speak(): String = {
    if (name == "Adam") {
      s"You don't get a hello"
    } else {
      s"Hello $name, you are $age $years old. \n You have ${bankAccount.balance} in your account"
    }
  }
}

object GreeterApplication extends App {
  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")

  val person = new Person(name, age.toInt)
  println(person.speak())


}

abstract class BankAccount(accountNumber: String, val balance: Double) {
  def withdraw(amount: Double): BankAccount

  def deposit(amount: Double): BankAccount
}


final class SavingsAccount(accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance) {
  override def withdraw(amount: Double): BankAccount = {
    if ((balance - amount) < 0) {
      println(s"You have insufficient funds, do one!!!!!")
      this
    } else {
      val deducted = balance - amount
      println(s"Balance after deductions: $deducted")
      new SavingsAccount(accountNumber, deducted)
    }
  }

  override def deposit(amount: Double): BankAccount = {
    new SavingsAccount(accountNumber, balance + amount)
  }
}


final class CashISAAccount(accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance) {
  override def withdraw(amount: Double): BankAccount = {
    println(s"You cannot withdraw from this ISA, do one!!!!!")
    this
  }

override def deposit (amount: Double): BankAccount = {
  new CashISAAccount (accountNumber, balance + amount)
}
}