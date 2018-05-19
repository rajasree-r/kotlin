/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    val num = 5
    println(factorial(num))
}

fun factorial(num:Int):Int{
    if(num == 1) return 1
    return num * factorial(num-1)
}