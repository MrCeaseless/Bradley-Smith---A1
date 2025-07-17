public class Dietitian extends HealthProfessional {

    //Attributes
    private String clinicType;
    
    private boolean hasDietPlans;

    //Default Constructor
    public Dietitian() {
        super();

        clinicType = "";

        hasDietPlans = true;
    }

    public Dietitian(int id, String name, String department, String clinicType, boolean hasDietPlans) {
        super(id, name, department);

        this.clinicType = clinicType;

        this.hasDietPlans = hasDietPlans;

    }

    @Override
    public void printDetails() {
        System.out.println("--- Dietitian Details ---");

        super.printDetails();

        System.out.println("Dietitian Clinic Type: " + clinicType);

        System.out.println("Offers diet plans: " + (hasDietPlans ? "Yes" : "No"));

    }



    

}
