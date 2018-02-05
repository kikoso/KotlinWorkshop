package kotlindemo.swm.de.kotlinworkshop.misc

import android.content.Context
import android.widget.Toast
import kotlindemo.swm.de.kotlinworkshop.beans.CustomerJava
import kotlindemo.swm.de.kotlinworkshop.beans.CustomerKotlin
import kotlindemo.swm.de.kotlinworkshop.nulls.CustomerServiceKotlin

fun test() {
    example()
    evaluate(Sum(Num(1),Num(2)))
    var customerJava : CustomerJava = CustomerJava()

    var customerKotlin : CustomerKotlin = CustomerKotlin(firstName = example(),lastName = "John")
    val anotherCustomerKotlin : CustomerKotlin = customerKotlin.copy(firstName = "Ralph")

    anotherCustomerKotlin.firstName = "Angela"

    unlimited("A", "B")
    unlimited("A", "B", "C")

    var triple = triple()
    var pair = pair()

    triple.first
    pair.second

    var customerServiceKotlin : CustomerServiceKotlin = CustomerServiceKotlin()
    customerServiceKotlin.validateCustomer(customerKotlin)

     var listOfNumbers = 100 downTo 1
     for (number in listOfNumbers step 2) {
         number.dec()
     }

    var aThing = null
    aThing?.let {

    }

    val a: Int? = null
    a?.toLong()

    val b = a?.toLong() ?: 0L
}

private fun example(): String = "Example"

fun anotherExample(): Double {
    var x = 1
    var y = 2.0
    return x + y
}

fun Context.betterToast(text: String = "Default") {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

val Context.anotherGoodExample: String
    get() = ""


fun unlimited(vararg arguments: String) {
    arguments.iterator()
}

fun pair(): Pair<String, String> {
    return Pair("A", "B")
}

fun triple(): Triple<String, String, String> {
    return Triple(third = "A", second = "B", first = "C")
}