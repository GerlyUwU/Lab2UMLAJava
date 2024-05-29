import java.util.ArrayList;
import java.util.List;

/**
 * Represents a company with a name and a list of employees.
 */
public class Company {
    private String name;
    private List<Employee> employees;
    private int nbEmployee;

    /**
     * Constructs a company with the given name.
     * @param name The name of the company.
     */
    public Company(String name) {
        employees = new ArrayList<>();
        this.name = name;
    }

    /**
     * Displays information about all employees in the company.
     */
    public void displayAll() {
        // here we going to show information about the employees
        for (Employee employee : employees) {
            employee.display();
        }
    }

    /**
     * Adds an employee to the company.
     * @param e The employee to add.
     */
    public void addEmployee(Employee e) {
        // here we can implements some
        // structure to review if the new employee already exist

        // this is the structure:
        boolean exist = false;
        for (Employee employee : employees) {
            if (employee.getName().equals(e.getName())) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            employees.add(e);
            System.out.println("Employee added: " + e.getName());
        } else {
            System.out.println("A employee wit the name already exists: " + e.getName());
        }

    }

    /**
     * Searches for an employee with the given name.
     * @param name The name to search for.
     * @return 1 if an employee with the name is found, otherwise -1.
     */
    public int searchName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return 1;
            }
        }
        return -1;
    }

    /**
     * Deletes an employee with the given name from the company.
     * @param name The name of the employee to delete.
     */
    public void deleteEmployee(String name) {
        boolean exist = false;
        Employee employeeTemp = new Employee();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employeeTemp = employee;
                exist = true;
                break;
            }
        }
        if (!exist) {

            System.out.println("This employee does not exist: " + name);
        } else {
            employees.remove(employeeTemp);
            System.out.println("The employee with the following name has been removed: " + employeeTemp.getName());
        }
    }

    /**
     * Calculates the yearly pay for an employee with the given name.
     * @param name The name of the employee.
     * @return The yearly pay of the employee, or -1.0 if the employee is not found.
     */
    public double getYearlyPay(String name) {
        boolean exist = false;
        Employee employeeTemp = new Employee();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employeeTemp = employee;
                exist = true;
                break;
            }
        }
        if (!exist) {
            return -1.0;
        } else {
            return employeeTemp.calculatePay() * 12;
        }

    }

    /**
     * Calculates the average pay for part-time employees in the company.
     * @return The average pay for part-time employees.
     */
    public double calAvgPayForPartTime() {
        double pay = 0.0;
        int partTimeNotaCopyForTheCodeOfMerlincito = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmp) {
                pay += employee.calculatePay();
                partTimeNotaCopyForTheCodeOfMerlincito++;
            }
        }
        if (partTimeNotaCopyForTheCodeOfMerlincito > 0) {
            return pay / partTimeNotaCopyForTheCodeOfMerlincito;
        } else {
            return 0.0;
        }
    }

}// end of the class Company
