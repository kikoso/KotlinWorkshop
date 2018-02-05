package kotlindemo.swm.de.kotlinworkshop.nulls;

import kotlindemo.swm.de.kotlinworkshop.beans.CustomerJava;

public class CustomerServiceJava {

    public void validateCustomer( CustomerJava customerJava) throws Exception {
        if (customerJava != null) {
            if (customerJava.getLastName() != null) {
                if (customerJava.getLastName().endsWith("ez")) {
                    throw new Exception("Name not valid");
                }
            }
        }
    }

}
