public class HealthProfessional {

    // Common Attributes 
    protected int id;
    protected String name;
    protected String department;

    // Default Constructor
    public HealthProfessional() {
        id = 0;
        name = "";
        department = "";

    }

    // Constructor with parameters
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Print method for the details of the health professional.

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
     }
    }
        
    


