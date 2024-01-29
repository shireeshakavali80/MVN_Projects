package comparable_equal;

import java.util.Objects;

public class Person {
    private double height;
    private double weight;
    private String ssn;  // Social Security Number
    private String phoneNumber;

    // Constructors

    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override equals method to match based on ssn
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(ssn, person.ssn);
    }

    // Example usage
    public static void main(String[] args) {
        // Creating persons
        Person person1 = new Person(150.0, 58.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(125.0, 80.0, "987-65-4321", "987-654-3210");

        // Checking equality based on ssn
        boolean areEqual = person1.equals(person2);
        System.out.println("Persons are equal based on SSN: " + areEqual);
    }
}