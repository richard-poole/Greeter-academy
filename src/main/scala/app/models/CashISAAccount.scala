package app.models

final class CashISAAccount(accountNumber: String, balance: Double, private val depositThreshold: Double = 200)
  extends BankAccount(accountNumber, balance) {

  override def withdraw(amount: Double): BankAccount = {
    println(s"You cannot withdraw from this ISA, do one!!!!!")
    this
  }
  override def deposit(amount: Double): BankAccount = {
    if (amount > depositThreshold) {
      val difference = amount - depositThreshold
      println(s"You cannot deposit more than £$depositThreshold. Excess is: £$difference.")
      new CashISAAccount(accountNumber, balance + depositThreshold)
    } else {
      new CashISAAccount(accountNumber, balance + amount)
    }
  }}
