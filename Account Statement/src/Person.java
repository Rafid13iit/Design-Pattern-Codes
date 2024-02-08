public class Person {
    private String name;
    private String designation;
    private String phoneNumber;

    public Person(String name, String designation, String phoneNumber) {
        this.name = name;
        this.designation = designation;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDesignation: " + designation + "\nPhone Number: " + phoneNumber;
    }
}

