public class Faculty extends Person {
    private double monthlySalary;

    public Faculty(String name, String designation, String phoneNumber, double monthlySalary) {
        super(name, designation, phoneNumber);
        this.monthlySalary = monthlySalary;
    }

    public double getSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMonthly Salary: $" + monthlySalary;
    }
}