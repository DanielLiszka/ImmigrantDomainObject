package edu.gmu.cs321;

public class RequestForm {
    private RequestFormModel requestFormObj;

    // Empty constructor for testing.
    public RequestForm() {
    }

    public RequestForm(RequestFormModel requestFormObj) {
        this.requestFormObj = requestFormObj;
    }

    // Adds a new request form via the RequestFormModel class.
    public String addNewRequest(String jsonData) {
        if (jsonData == null || jsonData.trim().isEmpty()) {
            return "Invalid Input";
        }

        int fakeImmigrantID = 123;

        RequestFormModel model = new RequestFormModel();
        int formID = model.addRequestForm(fakeImmigrantID);
        if (formID < 0) {
            return "Invalid Input";
        }

        this.requestFormObj = model;
        return "Success";
    }


    // Get the Immigrant object from the database based on the formID.
    public Immigrant getFormObjects(int formID) {
        if (formID < 0) {
            return null;
        }
        // Fake object for testing purposes.
        return new Immigrant(1, "John", "Doe", "123-45-6789", "05/05/1998", "Example Street", "City", "VA", 12345, "john.doe@email.com");
    }

    // Edits an existing request form and saves it to the database via the RequestFormModel class.
    public String editFormObjects(String jsonData) {
        if (this.requestFormObj == null || jsonData == null || jsonData.trim().isEmpty()) {
            return "Invalid Input";
        }
        RequestFormModel updated = new RequestFormModel(200, this.requestFormObj.getCreateDate(), 7777);
        String result = this.requestFormObj.editRequestForm(updated);
        if (!"Success".equals(result)) {
            return "Invalid Input";
        }
        return "Success";
    }

    // Helper methods.
    public RequestFormModel getRequestFormObj() {return requestFormObj;}
    public void setRequestFormObj(RequestFormModel requestFormObj) {this.requestFormObj = requestFormObj;}
}
