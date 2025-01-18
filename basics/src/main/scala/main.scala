
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@main
def main(): Unit = {
  // VALUES (val) are immutable
  // Types can be declared
  val y: Int = 3
  // Omitted types are inferred
  val x = 3 + 5
  println(x)


  // VARIABLES (val) are muttable
  var z = 3
  z = 6
  println(z)


  // BLOCKS can combine expressions. The last expression is the value of the block
  val aBlock = {
    val x = 1
    val y = 2
    x + y
  }
  println(aBlock)


  // FUNCTIONS
  // Anonymous function
  //  (x: Int) => x + 4

  // Named function
  val add = (x: Int, y: Int) => x + y
  println(add(10, 20))


  //  METHODS
  //  Similar to functions. Declared with def, with declared return type
  def addMethod(x:Int, y:Int): Int = x + y
  println(addMethod(22, 33))
  // It can have multiple parameter lists
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
  println(addThenMultiply(1, 2)(3))
  // Methods can be multiline. Last expression is return value
  def addThenMultiplyMultiline(x: Int, y: Int)(multiplier: Int): Int = {
    val sum = x + y
    sum * multiplier
  }
  println(addThenMultiplyMultiline(1, 2)(5))


  // CLASSES
  // Class definition receives constructor paramaters in declaration
  class Greeter(prefix: String, suffix: String) {
    // Method - Unit return type is same to void. Every scala method should have a return type
    def greet(name: String): Unit =
      println(prefix + name + suffix)
  }
}
