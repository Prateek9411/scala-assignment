/* Name: Prateek krishali -(1918553)
** Section: K(B. Tech), Semester: 5
*/

/*
** The defined class below performs basic arithmetic
** operations like Addition, Subtraction, Multiplication and
** Division of two numbers. At the time of instantiation
** it takes two number as argument and operate on them
** each method returns some value after calation
*/

class Calculator(cx:Int, cy:Int){
  var x:Int=cx
  var y:Int=cy

  def add():Int={   // a method of `Calculator` to add two numbers
    var sum:Int=0
    sum=x+y
    return (sum)
  }

  def sub():Int={   // a method of `Calculator` to subtract two numbers
    var sub:Int=0
    sub=x-y
    return (sub)
  }

  def mul():Int={   // a method of `Calculator` to multiply two numbers
    var mul:Int=0
    mul=x*y
    return (mul)
  }

  def div():Float={ // a method of `Calculator` to perform divion
    var div:Int=0
    div=x/y
    return (div)
  }

}


object calculate{     // Creating a singleton object
  def main(args:Array[String]){     //defining a `main` function to run code
    val calc = new Calculator(22, 7)  //Creating an instance of `Calculator`
    println("Addition of 22 and 7: "+calc.add())  //calling `add` method and prining result
    println("Subtraction of 22 and 7: "+calc.sub()) //calling `sub` method and prining result
    println("Multiplication of 22 and 7: "+calc.mul())  //calling `mul` method and prining result
    println("Division of 22 and 7: "+calc.div())  //calling `div` method and prining result
  }
}