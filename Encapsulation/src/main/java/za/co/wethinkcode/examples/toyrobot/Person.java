package za.co.wethinkcode.examples.toyrobot;

public class Person {

    //initializing attributes. Encapsulated with private
    private String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        validateName(name);
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    //getters as the attributes are encapsulated
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //setters with validation
    public void setName(String newName) {
        validateName(newName);
        this.name = newName;
    }

    public void setAge(int newAge) {
        validateAge(newAge);
        this.age = newAge;
    }


    //wrote these private method because it needs to be used in more than one place(contructor and setter) to keep the code DRY
    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" + "Age = " + age;
    }
}
