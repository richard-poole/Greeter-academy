class Person(name: String, age: Int) {
  def speak() : String = {
    if (name == "Billy") {
      s"You dont get a hello!"
    }else {
      s"Hello $name, you are $age $years old"
    }
  }
  private val years: String = if(age>1) "years" else "year"
}

class Animal(species:String){
  def speak() : String = {
    if (species == "Dog"){
      s"Woof Woof"
    }else{
      "hello"
    }
      }
}


val richard = new Person("richard", 10)
richard.speak()

val benji = new Animal("Dog")
benji.speak()

/*

ghryhtyhtyhtyh


yhythtyhtyhty

 */