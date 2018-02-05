package kotlindemo.swm.de.kotlinworkshop.nulls

import kotlindemo.swm.de.kotlinworkshop.beans.CustomerKotlin

class CustomerServiceKotlin {
    fun validateCustomer(customerKotlin: CustomerKotlin) {
        if (customerKotlin.firstName?.endsWith("ez")!!) {
            throw Exception("Not a right name")
        }
    }
}
