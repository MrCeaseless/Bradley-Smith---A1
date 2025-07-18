public class Appointment {
    // Patient attributes
    private String patientName;
    private String patientMobile;
    private String timeSlot;

    // Associated doctor (could be GP or Dietitian)
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        patientName = "";
        patientMobile = "";
        timeSlot = "";
    }

    // Parameterized constructor
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Prints all appointment details including doctor info
    public void printAppointment() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Health Professional Details:");
        doctor.printDetails(); // Uses polymorphism
    }

    // Returns the patient's mobile number
    public String getPatientMobile() {
        return patientMobile;
    }
}
