import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Faculty Information:");
        System.out.print("Name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Designation: ");
        String facultyDesignation = scanner.nextLine();
        System.out.print("Phone Number: ");
        String facultyPhoneNumber = scanner.nextLine();
        System.out.print("Monthly Salary: $");
        double facultyMonthlySalary = scanner.nextDouble();
        scanner.nextLine();

        Faculty facultyMember = new Faculty(facultyName, facultyDesignation, facultyPhoneNumber, facultyMonthlySalary);

        System.out.println("\nEnter Staff Information:");
        System.out.print("Name: ");
        String staffName = scanner.nextLine();
        System.out.print("Designation: ");
        String staffDesignation = scanner.nextLine();
        System.out.print("Phone Number: ");
        String staffPhoneNumber = scanner.nextLine();
        System.out.print("Hourly Rate: $");
        double staffHourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int staffHoursWorked = scanner.nextInt();
        scanner.nextLine();

        Staff staffMember = new Staff(staffName, staffDesignation, staffPhoneNumber, staffHourlyRate, staffHoursWorked);

        System.out.println("\nEnter Student Information:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Designation: ");
        String studentDesignation = scanner.nextLine();
        System.out.print("Phone Number: ");
        String studentPhoneNumber = scanner.nextLine();

        Student student = new Student(studentName, studentDesignation, studentPhoneNumber);

        System.out.println("\nFaculty Member Information:");
        System.out.println(facultyMember);
        System.out.println("Total Salary: $" + facultyMember.getSalary());

        System.out.println("\nStaff Member Information:");
        System.out.println(staffMember);

        System.out.println("\nStudent Information:");
        System.out.println(student);

        scanner.close(); // Close the scanner
    }
}
