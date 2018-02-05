@file:JvmName("GlobalFunctions")
package kotlindemo.swm.de.kotlinworkshop.beans

/**
 * Created by enriquelopezmanas on 01.02.18.
 */

open class Person {
    var name : String = ""
}

class Employee(var holidays : Int ) : Person()

class Contractor : Person()

fun validateHolidays(person: Person) {
    if (person is Employee) {
        print(person.holidays)
    } else if (person is Contractor) {
        print("Please take holidays")
    }
}

fun exampleFunction() : String = "Example"