public class GeneralPractitioner extends HealthProfessional {
    // Unique attributes for GPs
    private int gpLicenseNumber;
    private String specializationField;
    private boolean bulkBillingAvailable;

    // Default constructor calling the superclass's constructor
    public GeneralPractitioner() {
        super();
        gpLicenseNumber = 0;
        specializationField = "";
        bulkBillingAvailable = false;
    }

    // Parameterized constructor for full initialization
    public GeneralPractitioner(int id, String name, String department, int gpLicenseNumber, String specializationField, boolean bulkBillingAvailable) {
        super(id, name, department);
        this.gpLicenseNumber = gpLicenseNumber;
        this.specializationField = specializationField;
        this.bulkBillingAvailable = bulkBillingAvailable;
    }

    // Overridden method to print both inherited and GP-specific details
    @Override
    public void printDetails() {
        System.out.println("--- General Practitioner Details ---");
        super.printDetails();
        System.out.println("GP License Number: " + gpLicenseNumber);
        System.out.println("Specialization Field: " + specializationField);
        System.out.println("Is Bulk Billing Available: " + (bulkBillingAvailable ? "Yes" : "No"));
    }
}
