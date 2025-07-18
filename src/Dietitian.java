public class Dietitian extends HealthProfessional {
    // Unique attributes for Dietitians
    private String clinicType;
    private boolean hasDietPlans;

    // Default constructor
    public Dietitian() {
        super();
        clinicType = "";
        hasDietPlans = true;
    }

    // Parameterized constructor for initialization
    public Dietitian(int id, String name, String department, String clinicType, boolean hasDietPlans) {
        super(id, name, department);
        this.clinicType = clinicType;
        this.hasDietPlans = hasDietPlans;
    }

    // Overridden print method
    @Override
    public void printDetails() {
        System.out.println("--- Dietitian Details ---");
        super.printDetails();
        System.out.println("Dietitian Clinic Type: " + clinicType);
        System.out.println("Offers diet plans: " + (hasDietPlans ? "Yes" : "No"));
    }
}
