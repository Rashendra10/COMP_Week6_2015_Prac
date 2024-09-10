import java.util.Scanner;
//Name : Rashendra Kadariya 
//Student Id: 22137233
//subject: COMP2021


public class EmployeeDemo_22137233 {
    public static void main(String[] args) {
        // Instantiate using no-arg constructor
        Employee_22137233 accountant = new Employee_22137233();
        System.out.println("Accountant Info:");
        System.out.println("ID: " + accountant.getStaffID());
        System.out.println("First Name: " + accountant.getFirstName());
        System.out.println("Surname: " + accountant.getSurname());
        System.out.println("Pay Rate: " + accountant.getPayRate());

        // Input data from user for cleaner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cleaner Info:");
        System.out.print("ID: ");
        int cleanerId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("First Name: ");
        String cleanerFirstName = sc.nextLine();
        System.out.print("Surname: ");
        String cleanerSurname = sc.nextLine();
        System.out.print("Pay Rate: ");
        float cleanerPayRate = sc.nextFloat();
        sc.nextLine(); // consume newline

        Employee_22137233 cleaner = new Employee_22137233(cleanerId, cleanerFirstName, cleanerSurname, cleanerPayRate);
        cleaner.setPosition("Cleaner");
        cleaner.setSupervisorId(1);
        System.out.print("Hours Worked: ");
        float cleanerHoursWorked = sc.nextFloat();
        cleaner.setHoursWorked(cleanerHoursWorked);

        System.out.println("Gross Pay for Cleaner: " + cleaner.calculateGrossPay());

        // Input data from user for technician object
        System.out.println("Enter Technician Info:");
        System.out.print("ID: ");
        int techId = sc.nextInt();
        sc.nextLine();
        System.out.print("First Name: ");
        String techFirstName = sc.nextLine();
        System.out.print("Surname: ");
        String techSurname = sc.nextLine();
        System.out.print("Position: ");
        String techPosition = sc.nextLine();
        System.out.print("Supervisor ID: ");
        int techSupervisorId = sc.nextInt();
        System.out.print("Pay Rate: ");
        float techPayRate = sc.nextFloat();
        System.out.print("Hours Worked: ");
        float techHoursWorked = sc.nextFloat();

        Employee_22137233 technician = new Employee_22137233(techId, techFirstName, techSurname, techPosition, techSupervisorId, techPayRate, techHoursWorked);

        System.out.println("Gross Pay for Technician: " + technician.calculateGrossPay());
    }
    
}
