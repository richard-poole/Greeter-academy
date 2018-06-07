package app.models

abstract class BankAccount(accountNumber: String, val balance: Double) {
  def withdraw(amount: Double): BankAccount

  def deposit(amount: Double): BankAccount

  override def toString: String = s"Account number: $accountNumber, with a Balance of: £$balance"
}
