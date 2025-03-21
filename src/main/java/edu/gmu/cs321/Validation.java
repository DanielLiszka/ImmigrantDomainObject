package edu.gmu.cs321;

public class Validation {
    private String emailBody;
    private String emailRecipiantAddress;
    private Immigrant immigrantObj;
    private int immigrantStatus;
    private int addressValidation;

    public Validation() {
        this.emailBody = "";
        this.emailRecipiantAddress = "";
        this.immigrantObj = null;
        //For Int Statuses:  0 = Unknown, 1 = Valid, -1 = Invalid
        this.immigrantStatus = 0;
        this.addressValidation = 0;
    }

    // Validation service for the data entry operator. 
    public int validateFormFields(RequestForm requestObj) {
        return -1;
    }

    // Performs database operations to confirm immigration status. 
    public int validateImmigrantStatus(RequestForm requestObj) {
        return -1; 
    }

    // Performs database operations to validate the Immigrant's address. 
    public int validateImmigrantAddress(RequestForm requestObj) {
        return -1;
    }

    // Sends the approval email. 
    public void sendApprovalEmail(String emailRecipientAddress, String emailBody) {
       
    }

    // Edits the Immigration status.
    public void editImmigrantStatus(int newStatus) {
        
    }

    // Edits the address validation status.
    public void editAddressValidation(int newValidation) {

    }

    // Gets the Immigrant object from the database.
    public Immigrant getValidatedImmigrant(int immigrantID) {
        if (immigrantID < 0) {
            return null;
        }
        // Fake object for testing purposes. 
        return new Immigrant(immigrantID,"John", "Doe", "123-45-6789", "05/05/1998", "Example Street", "City", "VA", 12345, "john.doe@email.com");
        }

    // Saves the immigrant object to the database. 
    public String saveValidatedImmigrantObj(Immigrant obj) {
        if (obj == null || obj.getImmigrantID() < 0) {
            return "Invalid Input";
        }
        return "Success";
    }

    // Saves the edited validated Immigrant object to the database.
    public String editValidatedImmigrantObj(Immigrant obj) {
        if (obj == null || obj.getImmigrantID() < 0) {
            return "Invalid Input";
        }
        return "Success";
    }

    // Helper methods
    public void setEmailBody(String emailBody) {this.emailBody = emailBody;}
    public void setEmailRecipiantAddress(String emailRecipiantAddress) {this.emailRecipiantAddress = emailRecipiantAddress;}
    public void setImmigrantObj(Immigrant immigrantObj) {this.immigrantObj = immigrantObj;}

    // Getter methods for testing purposes.
    public String getEmailRecipiantAddress() {return emailRecipiantAddress;}
    public Immigrant getImmigrantObj() {return immigrantObj;}
    public String getEmailBody() {return emailBody;}
    public int getImmigrantStatus() {return immigrantStatus;}
    public int getAddressValidation() {return addressValidation;}

}
