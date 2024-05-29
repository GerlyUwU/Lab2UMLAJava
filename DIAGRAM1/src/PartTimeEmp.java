/**
 * Represents a part-time employee with a name, ID, number of work hours, and hourly rate.
 */
class PartTimeEmp extends Employee {
    private int nbWorkHours;
    private int rate;

    /**
     * Constructs a part-time employee with the given name, ID, number of work hours, and hourly rate.
     * @param name The name of the part-time employee.
     * @param id The ID of the part-time employee.
     * @param nbWorkHours The number of work hours of the part-time employee.
     * @param rate The hourly rate of the part-time employee.
     */
    public PartTimeEmp(String name, int id, int nbWorkHours, int rate) {
        super(name, id);
        this.nbWorkHours = nbWorkHours;
        this.rate = rate;
    }

    /**
     * Constructs a part-time employee with the same name, ID, number of work hours, and hourly rate as the given employee.
     * @param p The part-time employee to copy.
     */
    public PartTimeEmp(PartTimeEmp p){
        super(p.getName(),p.getId());
        this.nbWorkHours = nbWorkHours;
        this.rate = rate;
    }

    /**
     * Gets the number of work hours of the part-time employee.
     * @return The number of work hours of the part-time employee.
     */
    public int getNbWorkHours() {
        return nbWorkHours;
    }

    /**
     * Gets the hourly rate of the part-time employee.
     * @return The hourly rate of the part-time employee.
     */
    public int getRate() {
        return rate;
    }

    /**
     * Displays information about the part-time employee, including name, ID, number of work hours, and hourly rate.
     */
    public void display(){
        super.display();
        System.out.println("Work Hours: " + nbWorkHours + ", Rate: " + rate);
    }

    /**
     * Calculates the pay for the part-time employee, which is equal to the number of work hours multiplied by the hourly rate.
     * @return The pay of the part-time employee.
     */
    public double calculatePay(){
        return nbWorkHours * rate;
    }
}
