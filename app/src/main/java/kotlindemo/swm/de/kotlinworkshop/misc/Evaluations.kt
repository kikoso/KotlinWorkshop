package kotlindemo.swm.de.kotlinworkshop.misc

fun ifAsExpression(input: Int) {
    val result = if (input > 10) {
        println("Something")
        30
    } else {
        20
    }
}

fun ifAsExpression2(input: Int) {
    val result = if (input > 10) {
        val b = 30 + input
        b
    } else {
        100
    }
    println(result)
}
