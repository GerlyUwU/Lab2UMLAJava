/**
 * Represents a full-time employee with a name, ID, and salary.
 */
class FullTimeEmp extends Employee {
    private int salary;

    /**
     * Constructs a full-time employee with the given name, ID, and salary.
     * @param name The name of the full-time employee.
     * @param id The ID of the full-time employee.
     * @param salary The salary of the full-time employee.
     */
    public FullTimeEmp(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    /**
     * Constructs a full-time employee with the same name, ID, and salary as the given employee.
     * @param f The full-time employee to copy.
     */
    public FullTimeEmp(FullTimeEmp f) {
        super(f.getName(), f.getId());
        this.salary = salary;
    }

    /**
     * Displays information about the full-time employee, including name, ID, and salary.
     */
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

    /**
     * Calculates the pay for the full-time employee, which is equal to the salary.
     * @return The salary of the full-time employee.
     */
    public double calculatePay() {
        return salary;
    }

    /**
     * Gets the salary of the full-time employee.
     * @return The salary of the full-time employee.
     */
    public int getSalary() {
        return salary;
    }

}
