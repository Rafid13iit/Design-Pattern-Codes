public class Staff extends Person {
    private double hourlyRate;
    private int hoursWorked;

    public Staff(String name, String designation, String phoneNumber, double hourlyRate, int hoursWorked) {
        super(name, designation, phoneNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourly Rate: $" + hourlyRate + "\nHours Worked: " + hoursWorked +
                "\nTotal Salary: $" + getSalary();
    }
}