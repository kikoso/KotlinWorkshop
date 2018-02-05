package kotlindemo.swm.de.kotlinworkshop.inheritance

open class Person {

}

class Employee(val vacationDays: Int) : Person() {

}

class Contractor : Person()

fun validateVacations(person: Person) {
    if (person is Employee) {
        if (person.vacationDays <25) {
            System.out.print("You need to take some days off")
        }
    } else if (person is Contractor) {

    }
}