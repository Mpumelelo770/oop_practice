package za.co.wethinkcode.examples.toyrobot;

public class Author {
    private String name;
    private String email;

    //constructor
    public Author(String name, String email) {
        validateName(name);
        validateEmail(email);
        this.name = name;
        this.email = email;
    }


    //getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    //setters
    public void setName(String newName) {
        validateName(newName);
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        validateEmail(newEmail);
        this.email = newEmail;
    }

    //validations
    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
    }

    @Override
    public String toString() {
        return "Author name= " + name + "', email='" + email;
    }
}
