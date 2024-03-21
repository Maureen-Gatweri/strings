fun main() {
    println(isEven(21))



    var fullName = "Maureen Gatweri"
    println(fullName)
    var age = 31
    println(age)
    var weight = 60.00
    println(weight)
    println(isEven(10))


     var school="Akirachix"
    println(school[1]+" "+school[3]+" "+school[4])
    println(work("Maureen", 60))
    call("Gatweri")
    call("Rehema")
    call("Maureen")
    call("Mwendwa")

    println(roomTemperature(30.0))
    println(roomTemperature(56.0))


}

fun isEven(num: Int):Boolean {
    if (num % 2 == 0)
        return true
    else
        return false
}

fun isOdd(num: Int): Boolean {
   return num % 2 == 0

}
fun work(x: String, y: Int): String {
    return (" Hi, my name is$x and I am $y years old")

}

fun call(name: String) {
    if (name == "Maureen")
        println("That's me")
    else
        println("I don't know who that is")
    }

    fun roomTemperature(temp: Double):String{


  return("The temperature is $temp degree delicious")

    }

  }

