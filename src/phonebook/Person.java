package phonebook;

import javafx.beans.property.SimpleStringProperty;

public class Person {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty id;

    
    public Person() {
        this.lastName = new SimpleStringProperty("");
        this.firstName = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.id = new SimpleStringProperty("");
    }
    
    public Person(String lName, String fName, String email) {
        this.lastName = new SimpleStringProperty(lName);
        this.firstName = new SimpleStringProperty(fName);
        this.email = new SimpleStringProperty(email);
        this.id = new SimpleStringProperty("");
    }
    
    public Person(Integer id, String lName, String fName, String email) {
        this.lastName = new SimpleStringProperty(lName);
        this.firstName = new SimpleStringProperty(fName);
        this.email = new SimpleStringProperty(email);
        this.id = new SimpleStringProperty(String.valueOf(id));
    }

    public String getFirstName() {
        return firstName.get();
    }
    public void setFirstName(String fName){
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }
    public void setLastName(String lName){
        lastName.set(lName);
    }

    public String getEmail() {
        return email.get();
    }
    public void setEmail(String emailAddress){
        email.set(emailAddress);
    }
    
    public String getId(){
        return id.get();
    }
    
    public void setId(String fId){
        id.set(fId);
    }
    
    
}
