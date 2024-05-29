/**
 * Represents an employee with a name and an ID.
 */
public class Employee {
    private String name;
    private int id;

    /**
     * Constructs a default employee with empty name and ID.
     */
    public Employee() {

    }

    /**
     * Constructs an employee with the given name and ID.
     * @param name The name of the employee.
     * @param id The ID of the employee.
     */
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Constructs an employee with the same name and ID as the given employee.
     * @param e The employee to copy.
     */
    public Employee(Employee e) {
        this.id = e.getId();
        this.name = e.getName();
    }

    /**
     * Gets the name of the employee.
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the ID of the employee.
     * @return The ID of the employee.
     */
    public int getId() {
        return id;
    }

    /**
     * Displays information about the employee.
     */
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    /**
     * Calculates the pay for the employee.
     * @return The pay for the employee.
     */
    public double calculatePay() {
        return 0.0;
    }

}
