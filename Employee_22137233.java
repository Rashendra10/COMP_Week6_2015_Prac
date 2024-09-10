
//Name : Rashendra Kadariya 
//Student Id: 22137233
//subject: COMP2021


public class Employee_22137233 {
    // Attributes
    private int Employee_22137233Id;
    private String first;
    private String last;
    private String role;
    private int managerId;
    private double hourlyWage;
    private double totalHours;

    // No-Arg Constructor
    public Employee_22137233() {
        this.Employee_22137233Id = -1;
        this.first = "Unknown";
        this.last = "Unknown";
        this.role = "Unknown";
        this.managerId = 0;
        this.hourlyWage = 16.75; 
        this.totalHours = 0;
    }

    // Four-Argument Constructor
    public Employee_22137233(int Employee_22137233Id, String first, String last, double hourlyWage) {
        this.Employee_22137233Id = Employee_22137233Id;
        this.first = first;
        this.last = last;
        this.hourlyWage = hourlyWage > 0 ? hourlyWage : 16.75;
    }

    // Full-Argument Constructor
    public Employee_22137233(int Employee_22137233Id, String first, String last, String role, int managerId, double hourlyWage, double totalHours) {
        this.Employee_22137233Id = Employee_22137233Id;
        this.first = first;
        this.last = last;
        this.role = role;
        this.managerId = managerId;
        setHourlyWage(hourlyWage);
        setTotalHours(totalHours);
    }

    // Accessors (Getters)
    public int getEmployee_22137233Id() { return Employee_22137233Id; }
    public String getFirst() { return first; }
    public String getLast() { return last; }
    public String getRole() { return role; }
    public int getManagerId() { return managerId; }
    public double getHourlyWage() { return hourlyWage; }
    public double getTotalHours() { return totalHours; }

    // Mutators (Setters)
    public void setRole(String role) { this.role = role; }
    public void setManagerId(int managerId) { this.managerId = managerId; }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage > 0) {
            this.hourlyWage = hourlyWage;
        } else {
            System.out.println("Invalid hourly wage! Setting to default (16.75)");
            this.hourlyWage = 16.75;
        }
    }

    public void setTotalHours(double totalHours) {
        if (totalHours >= 0) {
            this.totalHours = totalHours;
        } else {
            System.out.println("Invalid total hours! Setting to 0.");
            this.totalHours = 0;
        }
    }

    // Gross Pay Calculation
    public double calculateGrossPay() {
        return hourlyWage * totalHours;
    }

    public int getStaffID() {
        return this.Employee_22137233Id;
    }

    public String getFirstName() {
        return this.first;
    }

    public String getSurname() {
        return this.last;
    }

    public double getPayRate() {
        return this.hourlyWage;
    }

	public void setPosition(String string) {
		//
	}

	public void setSupervisorId(int i) {
		// 
		
	}

	public void setHoursWorked(float cleanerHoursWorked) {
		//
	}

	
}