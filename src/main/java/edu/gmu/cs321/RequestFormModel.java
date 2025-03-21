package edu.gmu.cs321;

import java.util.Date;

public class RequestFormModel {
    private int formID;
    private Date createDate;
    private int immigrantID;

    // Empty constructor for testing.
    public RequestFormModel() {
    }

    public RequestFormModel(int formID, Date createDate, int immigrantID) {
        this.formID = formID;
        this.createDate = createDate;
        this.immigrantID = immigrantID;
    }

    // Adds a request form to the database.
    public int addRequestForm(int immigrantID) {
        if (immigrantID < 0) {
            return -1;
        }

        this.formID = 100 + immigrantID;
        this.immigrantID = immigrantID;
        this.createDate = new Date();
        return this.formID;
    }

    // Retrieves a request form based on the formID from the database.
    public RequestFormModel getRequestForm(int formID) {
        if (formID < 0) {
            return null;
        }
        // Fake object for testing.
        return new RequestFormModel(formID, new Date(), 9999);
    }

    // Edits an existing request form and saves it to the database.
    public String editRequestForm(RequestFormModel requestFormObj) {
        if (requestFormObj == null
            || requestFormObj.formID < 0
            || requestFormObj.immigrantID < 0
            || requestFormObj.createDate == null) {
            return "Invalid Input";
        }

        this.formID = requestFormObj.formID;
        this.immigrantID = requestFormObj.immigrantID;
        this.createDate = requestFormObj.createDate;
        return "Success";
    }

    // Public getter methods for testing purposes
    public int getFormID() { return formID; }
    public Date getCreateDate() { return createDate; }
    public int getImmigrantID() { return immigrantID; }
}
