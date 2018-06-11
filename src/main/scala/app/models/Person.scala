package app.models

class Person(name: String, age: Int, val bankAccount: Seq[BankAccount] = Nil) {

  private val excluded = List("Adam", "Daniel")

  def this(name: String, age: Int) = this(name, age, Seq(new SavingsAccount("12345", 0.00)))

  private val years: String = if (age > 1) "years" else "year"

  def speak(): String = {
    if (excluded.contains(name)) {
      s"You don't get a hello"
    } else {
      s"Hello $name, you are $age $years old. \n Your account details are: $bankAccount"
    }
  }
}
