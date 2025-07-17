public class Appointment {
// Patient Attributes

private String patientName;

private String patientMobile;

private String timeSlot;

private HealthProfessional doctor;

//Default Constructor 

public Appointment () {

    patientName = "";

    patientMobile ="";

    timeSlot = "";

}

public Appointment (String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {

    this.patientName = patientName;

    this.patientMobile = patientMobile;

    this.timeSlot = timeSlot;

    this.doctor = doctor;
}

public void printAppointment() {
    System.out.println("Patient Name: " + patientName);
    System.out.println("Mobile: " + patientMobile);
    System.out.println("Time Slot: " + timeSlot);
    System.out.println("Health Professional Details:");
    doctor.printDetails();
    }
}
