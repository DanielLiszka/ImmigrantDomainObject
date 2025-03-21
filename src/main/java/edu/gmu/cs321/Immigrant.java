package edu.gmu.cs321;

public class Immigrant {
    private int immigrantID;
    private String firstName;
    private String lastName;
    private String ssn;
    private String dob;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String emailAddress;

    public Immigrant(int immigrantID, String firstName, String lastName, String ssn, String dob, String streetAddress, String city, String state, int zipCode, String emailAddress) {
        this.immigrantID = immigrantID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.emailAddress = emailAddress;
    }

    // Empty constructor for the tests
    public Immigrant() {

    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }

    // Saves the Immigrant object to the database.
    public String saveImmigrant(String firstName, String lastName, String ssn, String dob, String streetAddress, String city, String state, int zipCode, String emailAddress) {
        if (isNullOrEmpty(firstName) || 
            isNullOrEmpty(lastName) || 
            isNullOrEmpty(ssn) || 
            isNullOrEmpty(dob) || 
            isNullOrEmpty(streetAddress) || 
            isNullOrEmpty(city) || 
            isNullOrEmpty(state) || 
            zipCode <= 0 || 
            isNullOrEmpty(emailAddress)) {
            return "Invalid Input";
        }
        // A Immigrant object will be saved to the database in the future and return a immigrantID, but for now we can use the ssn as a unique identifier.
        String immigrantID = ssn;
        return immigrantID;
    }

    // Updates the Immigrant object in the database with the provided updatedImmigrant object.
    public String editImmigrant(Immigrant updatedImmigrant) {
        if (updatedImmigrant == null || updatedImmigrant.getImmigrantID() < 0 ||
            isNullOrEmpty(updatedImmigrant.getFirstName()) ||
            isNullOrEmpty(updatedImmigrant.getLastName()) ||
            isNullOrEmpty(updatedImmigrant.getSsn()) ||
            isNullOrEmpty(updatedImmigrant.getDob()) ||
            isNullOrEmpty(updatedImmigrant.getStreetAddress()) ||
            isNullOrEmpty(updatedImmigrant.getCity()) ||
            isNullOrEmpty(updatedImmigrant.getState()) ||
            updatedImmigrant.getZipCode() <= 0 ||
            isNullOrEmpty(updatedImmigrant.getEmailAddress())) {
                return "Invalid Input field in the updatedImmigrant object";
        }
        // The updated Immigrant object will be saved to the database and the database service will return a success message.
        return "Success";
    }

    // Retrieves the Immigrant object from the database for the given immigrantID.
    public Immigrant getImmigrant(int immigrantID) {
        if (immigrantID < 0) {
            return null;
        }
        // Return a fake immigrant object for the test. It will retrieve the Immigrant object from the database in the future.
        return new Immigrant(immigrantID, "John", "Doe", "123-45-6789", "05/05/1998", "Example Street", "City", "VA", 12345, "john.doe@email.com");
        }

    // Not implemented yet, but will check if a Immigrant exists in the system. 
    public boolean queryImmigrant(int immigrantID) {
        return false;
    }

    // Helper method
    private boolean isNullOrEmpty(String s) {
        return (s == null || s.trim().isEmpty());
    }

    // Public getters for testing purposes
    public int getImmigrantID() {return immigrantID;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSsn() {return ssn;}
    public String getDob() {return dob;}
    public String getStreetAddress() {return streetAddress;}
    public String getCity() {return city;}
    public String getState() {return state;}
    public int getZipCode() {return zipCode;}
    public String getEmailAddress() {return emailAddress;}
}
