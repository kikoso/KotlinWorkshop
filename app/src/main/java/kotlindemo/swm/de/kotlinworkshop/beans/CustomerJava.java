package kotlindemo.swm.de.kotlinworkshop.beans;

public class CustomerJava {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        int number = 1;
        System.out.println(number);
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
