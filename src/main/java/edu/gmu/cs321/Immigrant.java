package edu.gmu.cs321;

public class Immigrant {
    String firstName;
    String lastName;
    String DOB;
    int age;

    public Immigrant(String firstName, String lastName, String DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public static void main(String[] args) {
        Immigrant newImmigrant = new Immigrant("John", "Doe", "03/24/1991");
        System.out.println(newImmigrant.firstName + " " + newImmigrant.lastName + " " + newImmigrant.DOB);
    }
}
