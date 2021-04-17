package com.hikmetcakir.package16;

public class Person {

    private String firstName;
    private String lastName;


    public Person() {
        this("Eric","Jonson"); // this reference always use in constructor (!Be warm, ONLY CONSTRUCTOR)
    }

    public Person(String firstName, String last) {
//        this(); // java: recursive constructor invocation
        this.firstName = firstName;
//        this.lastName = last;
//        String lastName = "myName";
        lastName = last;
    }

    public void setFirstName(String FirstName) {
//        this.firstName = _theFirstName;
        this.firstName = FirstName;
    }

    public String getFirstName() {
//        this();
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


    public static void main(String[] args) {

    }
}
