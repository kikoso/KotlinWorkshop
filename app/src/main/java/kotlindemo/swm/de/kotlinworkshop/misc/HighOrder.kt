package kotlindemo.swm.de.kotlinworkshop.misc

fun highOrder(func: (Int,Int) -> Int) {
    println(func(2,3))
}

fun mySum(x: Int, y: Int) : Int = x+y

fun myMultiplication(x: Int, y: Int) : Int = x*y

fun main(arg: Array<String>) {
    highOrder(::mySum)
    highOrder(::myMultiplication)
}