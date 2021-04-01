fun main() {
    greeter2("Jacob")
    println("Volume 1 is ${volume2(10,5)}")
    println("Volume 2 is ${volumeX(width = 7, height = 13)}")
}

//standard function
fun greeter(name: String): String {
    return "Hello $name"
}

//same function, rewritten for compactness
fun greeter2(name: String) = "Hello $name"

fun volume(length: Int, width: Int, height:Int) = length * width * height

//same code, but the program will use 10 as default if a value is not passed for height
fun volume2(length: Int, width: Int, height:Int = 10) = length * width * height

//when the first parameter has a default value, each parameter must be explicit (check main)
fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height

