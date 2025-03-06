package edu.gmu.cs321;

public class Immigrant {
    int ImmigrantID;
    String firstName;
    String lastName;
    String SSN;
    String DOB;
    String StreetAddress;
    String City;
    String State;
    int zipCode;
    String emailAddress;

    public Immigrant(String firstName, String lastName, String DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }

    public void getGreenCardRequest(int ImmigrantID) {
        // Get the Green Card Request JSON object to database.
    }

    public void saveGreenCardRequestObj(Object Immigrant) {
        // Save the Green Card Request JSON object to database
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
