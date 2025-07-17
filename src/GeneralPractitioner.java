

public class GeneralPractitioner extends HealthProfessional {
    // Attributes / Fields for the GP child class
    private int gpLicenseNumber;
    private String specializationField;
    private boolean bulkBillingAvailable;

    //Default Constructor 
    public GeneralPractitioner() {
        
        // Calls the HealthProfessional's default Constructor
        super(); 

        gpLicenseNumber = 0;

        specializationField = "";

        bulkBillingAvailable = false; // Default assumption / Placeholder

    }

    // Parameterized Constructor, Allowing full intialization of both the base class and GP class. 
    public GeneralPractitioner(int id, String name, String department, int gpLicenseNumber, String specializationField, boolean bulkBillingAvailable) {
        super(id, name, department);

        this.gpLicenseNumber = gpLicenseNumber;
        this.specializationField = specializationField;
        this.bulkBillingAvailable = bulkBillingAvailable;
    }

    @Override //Overide the print details method from the HealthProfessional Class
    public void printDetails() {
        System.out.println("--- General Practitioner Details ---");

        super.printDetails();

        System.out.println("GP License Number: " + gpLicenseNumber);

        System.out.println("Specialization Field: " + specializationField);

        System.out.println("Is Bulk Billing Available: " + (bulkBillingAvailable ? "Yes" : "No"));

    }
    
}
