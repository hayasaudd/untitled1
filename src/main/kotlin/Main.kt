fun main(args: Array<String>) {
    println("Hello World!")

    println("Program arguments: ${args.joinToString()}")

    println("calculator")
    println("which operation you need it")
    println("press 1 if you want + the numbers")
    println("press 2 if you want - the numbers")
    println("press 3 if you want * the numbers")
    println("press 4 if you want / the numbers")
    println("press 5 if you want % the numbers")


    val op = readLine()!! .toInt()
    println("ENTER TOW NUMBERS YOU WANT IT")
    val num1 = readLine()!! .toDouble()
    val num2 = readLine()!! .toDouble()
    println("THE RESULT IS:")
    val add = num1 + num2
    val mines = ("${num1 - num2}")
    val cross = ("${num1 * num2}")
    val divide = ("${num1 / num2}")
    val models = ("${num1  % num2}")



    when (op) {
        1 -> println("$add")
        2 -> println("$mines")
        3 -> println("$cross")
        4 -> println( "$divide")
        5 -> println("$models")
        else -> println("field")
    }
}