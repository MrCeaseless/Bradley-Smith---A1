public class HealthProfessional {
    // Common attributes shared across all health professionals
    protected int id;
    protected String name;
    protected String department;

    // Default constructor - assigns default placeholder values
    public HealthProfessional() {
        id = 0;
        name = "";
        department = "";
    }

    // Constructor to initialize all attributes
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Prints the common attributes
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
